
resolvers += Classpaths.typesafeSnapshots

libraryDependencies <+= (sbtVersion) { sbtVersion =>
  "org.scala-tools.sbt" %% "scripted-plugin" % sbtVersion
}
