import sbt._
import Keys._

object ApplicationBuild extends Build {

    val appName         = "My first application"
    val appVersion      = "1.0"

    val appDependencies = Seq(
        
      "mysql" % "mysql-connector-java" % "5.1.33"
      
    )


}
