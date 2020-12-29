lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.workshop",
      scalaVersion := "2.12.3",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "Scala Workshop",
    libraryDependencies ++= Seq(
      "joda-time" % "joda-time" % "2.10.9",
      "org.specs2" %% "specs2-core" % "3.9.4" % Test,
      "org.specs2" %% "specs2-scalacheck" % "3.9.4" % Test
    )
  )
