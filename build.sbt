import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "scala-review",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      "org.mockito" % "mockito-core" % "1.10.19" % "test"
    )
  )
