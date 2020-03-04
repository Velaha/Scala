import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{ ContentTypes, HttpEntity, StatusCodes }
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer
import de.heikoseeberger.akkahttpcirce.FailFastCirceSupport
import io.circe.generic.auto._
import model.Contact
import StatusCodes._
import io.circe.syntax._

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
          case Some(contact) => complete(OK -> contact.asJson.noSpaces)
          case None => complete(NotFound -> "None contact found")
        }
      }
    }
  } ~ path("api" / "contacts") {
    post {
      entity(as[Contact]) { c: Contact =>
        onComplete(Future(AppContext.contactService.createContact(c)))(_ => complete(OK -> c))
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
