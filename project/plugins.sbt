libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-nop" % "latest.integration",
  "io.github.zero-deps" %% "ext-bld" % "2.4.1.g7c28a4a",
)
resolvers += Resolver.githubPackages("zero-deps")

addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.2")
