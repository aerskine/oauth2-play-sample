import sbt._
import Keys._
import play.Project._
import org.sbtidea.SbtIdeaPlugin._

object ApplicationBuild extends Build {
  val appName         = "auth2-sample"
  val appVersion      = "1.0"

  val appDependencies = Seq(
    jdbc,
    anorm,
    cache,
    "securesocial" %% "securesocial" % "master-SNAPSHOT"
  )
  val main = play.Project(appName, appVersion, appDependencies).settings(
    //resolvers += Resolver.url("sbt-plugin-releases", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
    resolvers += Resolver.url("sbt-plugin-snapshots", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-snapshots/"))(Resolver.ivyStylePatterns),
    ideaExcludeFolders += ".idea",
    ideaExcludeFolders += ".idea_modules"
  )
}
