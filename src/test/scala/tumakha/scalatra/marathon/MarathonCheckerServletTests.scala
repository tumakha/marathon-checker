package tumakha.scalatra.marathon

import org.scalatra.test.scalatest._

class MarathonCheckerServletTests extends ScalatraFunSuite {

  addServlet(classOf[MarathonCheckerServlet], "/*")

  test("GET / on MarathonCheckerServlet should return status 200") {
    get("/") {
      status should equal (500)
    }
  }

}
