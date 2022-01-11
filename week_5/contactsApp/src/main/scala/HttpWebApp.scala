import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.ContentTypes
import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.{Route, StandardRoute}
import akka.stream.ActorMaterializer
import de.heikoseeberger.akkahttpcirce.FailFastCirceSupport
import io.circe.generic.auto._
import model.Contact

import scala.concurrent.Future
import scala.io.StdIn
import scala.util.{Failure, Success, Try}

object HttpWebApp extends App with FailFastCirceSupport {

  implicit val system = ActorSystem("default")
  implicit val materializer = ActorMaterializer()

  // needed for binding map/flatMap
  implicit val executionContext = system.dispatcher

  val jsonType = ContentTypes.`application/json`
  val route: Route =
    path("api" / "contacts" / LongNumber) { id =>
      get {
        onComplete(Future(AppContext.contactService.getContact(id))) {
          handleResult(_) {
            case Some(contact) => complete(OK -> contact.toString)
            case None => complete(NotFound -> "None contact found")
          }
        }
      } ~ delete {
        onComplete(Future(AppContext.contactService.suppressionContact(id)))(
          handleResult(_)  {
            case Some(_) => complete(OK -> s"Contact ${id} has been deleted with success")
            case None => complete(NotFound -> s"None contact found for ${id}")
          }
        )
      }
    } ~ path("api" / "contacts") {
      post {
        entity(as[Contact]) { c: Contact =>
          onComplete(Future(AppContext.contactService.createContact(c)))(
            handleResult(_)(contact => complete(OK -> contact.toString))
          )
        }
      } ~ get {
        onComplete(Future.successful(AppContext.contactService.getAllContacts)) {
          handleResult(_)(contacts => complete(OK -> contacts.map(_.toString)))
        }
      }

    } ~ path("api" / "test") {
      get {
        complete(OK -> "it works!!")
      }
    } ~ path("api" / "search") {
      get {
        parameters('field, 'value) { (field: String, value: String) =>
          onComplete(Future(AppContext.contactService.searchContact(field, value)))(
            handleResult(_)(contact => complete(OK -> contact.toString))
          )
        }
      }
    }

  val bindingFuture = Http().bindAndHandle(route, "localhost", 8080)
  println(s"Server online @ http://localhost:8080/\nPress RETURN to stop...")
  StdIn.readLine()
  bindingFuture
    .flatMap(_.unbind())
    .onComplete(_ => system.terminate())



  private def handleResult[A](t: Try[A])(f: A => StandardRoute): StandardRoute =
    t match {
      case Failure(e) => complete(InternalServerError -> s"an error occured : ${e.getMessage}")
      case Success(r) => f(r)
    }
}

