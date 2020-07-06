lazy val akkaHttpVersion = "10.1.11"
lazy val akkaVersion    = "2.6.5"

// reload SBT shell every time a SBT change is made
Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = (project in file("."))
  .aggregate(apiGRPCLayer)
  .aggregate(apiRESTLayer)
  .aggregate(applicationLayer)
  .aggregate(coreDomain)
  .aggregate(infrastructureLayer)
  .settings(
    inThisBuild(List(
      organization    := "io.visity",
      scalaVersion    := "2.13.1"
    )),
    name := "visity",
    libraryDependencies ++= (ApiGRPCLayer.dependencies ++
      ApiRESTLayer.dependencies ++
      ApplicationLayer.dependencies ++
      InfrastructureLayer.dependencies ++
      TestDependencies.all)
  )

lazy val apiGRPCLayer = (project in file("api.grpc"))
  .dependsOn(coreDomain)
  .dependsOn(infrastructureLayer)
  .dependsOn(applicationLayer)
  .settings(
    name := "visity:apiGRPCLayer",
    libraryDependencies ++= (ApiGRPCLayer.dependencies ++
      ApplicationLayer.dependencies ++
      InfrastructureLayer.dependencies ++
      TestDependencies.all)
  )

lazy val apiRESTLayer = (project in file("api.rest"))
  .dependsOn(coreDomain)
  .dependsOn(infrastructureLayer)
  .dependsOn(applicationLayer)
  .settings(
    name := "visity:apiRESTLayer",
    libraryDependencies ++= (ApiRESTLayer.dependencies ++
      ApplicationLayer.dependencies ++
      InfrastructureLayer.dependencies ++
      TestDependencies.all)
  )

lazy val applicationLayer = (project in file("application"))
  .dependsOn(coreDomain)
  .dependsOn(infrastructureLayer)
  .settings(
    name := "visity:applicationLayer",
    libraryDependencies ++= (ApplicationLayer.dependencies ++
      CoreDomain.dependencies ++
      InfrastructureLayer.dependencies ++
      TestDependencies.all)
  )

lazy val coreDomain = (project in file("domain"))
  .settings(
    name := "visity:coreDomain",
    libraryDependencies ++= (CoreDomain.dependencies ++ TestDependencies.all)
  )

lazy val infrastructureLayer = (project in file("infrastructure"))
  .settings(
    name := "visity:infrastructureLayer",
    libraryDependencies ++= (InfrastructureLayer.dependencies ++ TestDependencies.all)
  )