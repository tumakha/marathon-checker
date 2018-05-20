package tumakha.scalatra.marathon

import org.scalatra.ScalatraServlet
import org.json4s._
import org.json4s.jackson.JsonMethods._

class MarathonCheckerServlet extends ScalatraServlet {

  before() {
    contentType="text/plain"
  }

  get("/") {
    import dispatch._, Defaults._

    var result = ""
    for {
      host <- params("hosts").split(",")
      app <- params.getOrElse("apps", "-").split(",")
    } {
      val url = dispatch.url(s"http://$host/v2/apps?id=$app")
      val response = Http.default(url OK as.String)
      val jsonBody = parse(response())
      val ids = (jsonBody \ "apps" \ "id").children
      val versions = (jsonBody \ "apps" \ "labels" \ "version").children
      result += ids.zip(versions).map(t => s"${t._1.values}:${t._2.values}\n").mkString + "\n"
    }

    {result}
  }

}
