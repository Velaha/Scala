import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.model.{ ContentTypes, StatusCodes }
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer
import de.heikoseeberger.akkahttpcirce.FailFastCirceSupport
import io.circe.generic.auto._
import io.circe.syntax._
import model.Contact

import scala.concurrent.Future
import scala.io.StdIn
import scala.util.{ Failure, Success, Try }

object HttpWebApp extends App with FailFastCirceSupport {

  implicit val system       = ActorSystem("default")
  implicit val materializer = ActorMaterializer()

  // needed for binding map/flatMap
  implicit val executionContext = system.dispatcher

  val jsonType = ContentTypes.`application/json`
  val route =
    path("api" / "contacts" / LongNumber) { id =>
      get {
        onComplete(Future.successful(AppContext.contactService.getContact(id))) { c =>
          convert(c) match {
            case Some(contact) => complete(OK -> contact.asJson)
            case None => complete(NotFound -> "None contact found")
          }
        }
      } ~ delete {
        onComplete(Future(AppContext.contactService.suppressionContact(id)))(c =>
          convert(c) match {
            case Some(contact) => complete(OK -> s"Contact ${id} as been deleted with success")
            case None => complete(NotFound -> s"None contact found for ${id}")
          }
        )

      }
    } ~ path("api" / "contacts") {
      post {
        entity(as[Contact]) { c: Contact =>
          onComplete(Future(AppContext.contactService.createContact(c)))(contact => complete(OK -> convert(contact).asJson))
        }
      }
    }

  val bindingFuture = Http().bindAndHandle(route, "localhost", 8080)
  println(s"Server online @ http://localhost:8080/\nPress RETURN to stop...")
  StdIn.readLine()
  bindingFuture
    .flatMap(_.unbind())
    .onComplete(_ => system.terminate())

  private def convert[A](t: Try[A]): A =
    t match {
      case Failure(_) => throw new Exception("Error")
      case Success(r) => r
    }
}
