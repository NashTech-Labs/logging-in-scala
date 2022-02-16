
lazy val root = (project in file(".")).
  settings(
    name := "logging-in-scala",
    scalaVersion := "2.13.1",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % "2.6.5"
  )
