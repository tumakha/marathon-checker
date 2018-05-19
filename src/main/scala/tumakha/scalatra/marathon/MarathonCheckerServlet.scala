package tumakha.scalatra.marathon

import org.scalatra._

class MarathonCheckerServlet extends ScalatraServlet {

  get("/") {
    <h1>Hello, {params.getOrElse("name", "World")}!</h1>
  }

}
