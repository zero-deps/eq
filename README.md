# scala-compiler-plugin

![ci](https://github.com/zero-deps/scala-compiler-plugin/workflows/ci/badge.svg)

Compiler plugin to restrict `==`/`!=` to compare same types and forbid comparison of arrays.

```scala
// build.sbt
libraryDependencies += compilerPlugin("io.github.zero-deps" %% "eq" % "latest.integration")
resolvers += Resolver.githubPackages("zero-deps")

// project/plugins.sbt
addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.2")

// specification and showcase
sbt 'project demo' run
```

