ThisBuild / scalaVersion := "2.13.4"
ThisBuild / githubOwner := "zero-deps"
ThisBuild / githubRepository := "eq"
ThisBuild / organization := "io.github.zero-deps"
ThisBuild / version := zero.ext.git.version
ThisBuild / scalacOptions ++= Vector(
  "-feature",
  "-deprecation",
  "-Ywarn-unused:imports",
  "-language:experimental.macros",
)
ThisBuild / isSnapshot := true // override local artifacts

ThisBuild / turbo := true
ThisBuild / useCoursier := true
Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val eq = project.in(file(".")).settings(
  libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value % Provided,
)

// scalac -Xshow-phases
lazy val demo = project.in(file("demo")).settings(
  skip in publish := true,
  scalaVersion := "2.13.4",
  scalacOptions ++= Vector(
    "-feature",
    "-deprecation",
    // "-Ybrowse:typer", // view generated code
  ),
  run / fork := true,
  libraryDependencies += compilerPlugin(
                         "io.github.zero-deps" %% "ext-plug" % "2.4.1.g7c28a4a"),
  libraryDependencies += "io.github.zero-deps" %% "ext"      % "2.4.1.g7c28a4a",
)
