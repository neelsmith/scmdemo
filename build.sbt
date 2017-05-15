
crossScalaVersions := Seq("2.11.8")
scalaVersion := "2.11.8"

lazy val root = project.in(file(".")).
    aggregate(crossedJVM, crossedJS).
    settings(
      publish := {},
      publishLocal := {}

    )

lazy val crossed = crossProject.in(file(".")).
    settings(
      resolvers ++= Seq(
        Resolver.jcenterRepo,
        "beta" at "http://beta.hpcc.uh.edu/nexus/content/repositories/releases",
        Resolver.bintrayRepo("neelsmith", "maven")
      ),
      libraryDependencies ++= Seq(
        "org.scala-js" %% "scalajs-stubs" % scalaJSVersion % "provided",
        "org.scalatest" %%% "scalatest" % "3.0.1" % "test",

        "edu.holycross.shot.cite" %%% "xcite" % "2.3.2",
        "edu.holycross.shot" %%% "ohco2" % "8.0.1",
        "edu.holycross.shot" %%% "citeobj" % "1.1.1",
        "edu.holycross.shot" %%% "cex" % "3.0.0",
        "edu.holycross.shot" %%% "scm" % "3.0.2"
      )
    ).
    jvmSettings(

    ).
    jsSettings(
      skip in packageJSDependencies := false,
      persistLauncher in Compile := true,
      persistLauncher in Test := false
    )

lazy val crossedJVM = crossed.jvm
lazy val crossedJS = crossed.js.enablePlugins(ScalaJSPlugin)
