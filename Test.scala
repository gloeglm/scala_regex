import scala.util.matching.Regex

object Test {
   def main(args: Array[String]) {
      val pattern = ".*(Scala)ble.*"
      val str = "Scala is Scalable and cool"

      println(searchForFirstMatch(str, pattern).getOrElse("Not Found"))
   }

   def searchForFirstMatch(html: String, regexp: String) : Option[String] = {
      val pattern = regexp.r
      val result = html match {
         case pattern(x) => Some(x)
         case _ => None
      }
      return result
   }
}
