import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "modular-ui-demo"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "org.webjars" % "webjars-play" % "2.0",
      "org.webjars" % "bootstrap" % "2.2.1"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
