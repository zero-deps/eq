# eq

![ci](https://github.com/zero-deps/eq/workflows/ci/badge.svg)

Compiler plugin to restrict `==`/`!=` to compare same types and forbid comparison of arrays.

```scala
// build.sbt
libraryDependencies += compilerPlugin("io.github.zero-deps" %% "eq" % "latest.integration")
resolvers += Resolver.githubPackages("zero-deps")

// project/plugins.sbt
addSbtPlugin("com.codecommit" % "sbt-github-packages" % "latest.integration")

// specification and showcase
sbt 'project demo' run
```

## What about Scala 3 support?

You do not need plugin because Scala 3 already contains such functionality:

```sbt
scalacOptions += "-language:strictEquality"
```

And then you can add comparators for concrete types.
But do not add generic comparator which will cover `Array` case.
