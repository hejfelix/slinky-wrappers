import Dependencies._

inThisBuild(
  List(
    // These are normal sbt settings to configure for release, skip if already defined
    licenses := Seq("MIT" -> url("http://opensource.org/licenses/mit")),
    homepage := Some(url("https://github.com/hejfelix/slinky-wrappers")),
    developers := List(
      Developer("hejfelix",
                "Felix Bjært Hargreaves",
                "hargreaves@lambdaminute.com",
                url("https://github.com/hejfelix"))),
    scmInfo := Some(ScmInfo(url("https://github.com/hejfelix/slinky-wrappers"),
                            "scm:git:git@github.com:hejfelix/slinky-wrappers.git")),
    // These are the sbt-release-early settings to configure
    pgpPublicRing := file("./travis/local.pubring.asc"),
    pgpSecretRing := file("./travis/local.secring.asc"),
    releaseEarlyWith := SonatypePublisher,
    organization := "com.lambdaminute.slinkywrappers",
    scalaVersion := "2.12.4"
  ))

val slinkyVersion     = "0.3.2"
val materialUiVersion = "1.0.0-beta.35"

lazy val materialUi =
  project
    .in(file("material-ui"))
    .enablePlugins(ScalaJSPlugin)
    .settings(
      libraryDependencies += "me.shadaj" %%% "slinky-web" % slinkyVersion,
      addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M11" cross CrossVersion.full)
    )
lazy val demo = project
  .in(file("demo"))
  .enablePlugins(ScalaJSBundlerPlugin)
  .settings(
    npmDependencies in Compile ++= Seq("react"                  -> "16.2.0",
                                       "react-dom"              -> "16.2.0",
                                       "react-proxy"            -> "1.1.8",
                                       "material-ui"            -> materialUiVersion,
                                       "material-ui-icons"      -> materialUiVersion),
    npmDevDependencies in Compile ++= Seq("file-loader"         -> "1.1.5",
                                          "style-loader"        -> "0.19.0",
                                          "css-loader"          -> "0.28.7",
                                          "html-webpack-plugin" -> "2.30.1",
                                          "copy-webpack-plugin" -> "4.2.0"),
    libraryDependencies += "me.shadaj" %%% "slinky-web" % slinkyVersion,
    libraryDependencies += "me.shadaj" %%% "slinky-hot" % slinkyVersion,
    scalacOptions += "-P:scalajs:sjsDefinedByDefault",
    webpackConfigFile in fastOptJS := Some(baseDirectory.value / "webpack-fastopt.config.js"),
    webpackConfigFile in fullOptJS := Some(baseDirectory.value / "webpack-opt.config.js"),
    webpackDevServerExtraArgs in fastOptJS := Seq("--inline", "--hot"),
    webpackBundlingMode in fastOptJS := BundlingMode.LibraryOnly(),
    addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M11" cross CrossVersion.full)
  )
  .dependsOn(materialUi)
