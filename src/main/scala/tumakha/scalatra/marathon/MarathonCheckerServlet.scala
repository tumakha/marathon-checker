package tumakha.scalatra.marathon

import org.scalatra._

class MarathonCheckerServlet extends ScalatraServlet {

  get("/") {
    <h1>Hello, {params("name")}</h1>
  }

}
