//To have automatic reloading: ~;container:start; container:reload /

resolvers += "Primefaces repo" at "http://repository.primefaces.org"

seq(webSettings :_*)

name := "primefaces-scala-cassandra"

version := "1.0"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "container",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.apache.myfaces.core" % "myfaces-api" % "2.1.7" % "compile",
  "org.apache.myfaces.core" % "myfaces-impl" % "2.1.7" % "compile",
  "javax.el" % "el-api" % "2.2" % "compile",
  "org.glassfish.web" % "el-impl" % "2.2" % "compile",
  "javax.annotation" % "jsr250-api" % "1.0" % "provided",
  "javax.servlet" % "jstl" % "1.2" % "compile",
  "javax.servlet.jsp" % "jsp-api" % "2.1" % "provided",
  "org.primefaces" % "primefaces" % "3.2" % "compile",
  "me.prettyprint" % "hector-core" % "1.0-5" % "compile"
)
