import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer
import io.circe._, io.circe.parser._

import scala.io.StdIn

object HttpWebApp extends App {

  implicit val system = ActorSystem("default")
  implicit val materializer = ActorMaterializer()

  // needed for binding map/flatMap
  implicit val executionContext = system.dispatcher

  val jsonType = ContentTypes.`application/json`
  val route =

    path("api"/"contacts"/ LongNumber) { id =>
      get {
        complete(HttpEntity(jsonType, """{"message": "Hello World!"}"""))
      }
    }


  val bindingFuture = Http().bindAndHandle(route, "localhost", 8080)
  println(s"Server online @ http://localhost:8080/\nPress RETURN to stop...")
  StdIn.readLine()
  bindingFuture
    .flatMap(_.unbind())
    .onComplete(_ => system.terminate())




}
