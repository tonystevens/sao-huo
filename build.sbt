import play.Project._

name := "computer-database"

version := "1.0"

libraryDependencies ++= Seq(javaJdbc, javaEbean)
libraryDependencies += "postgresql" % "postgresql" % "9.1-901-1.jdbc4"

playJavaSettings
