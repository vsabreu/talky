
// reload SBT shell every time a SBT change is made
Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val apiGRPCLayer = ApiGRPCLayer.apiGRPCLayer
lazy val apiRESTLayer = ApiRESTLayer.apiRESTLayer
lazy val applicationLayer = ApplicationLayer.applicationLayer
lazy val coreDomain = CoreDomain.coreDomain
lazy val infrastructureLayer = InfrastructureLayer.infrastructureLayer

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
    libraryDependencies ++= (ApiGRPCLayer.Dependencies.all ++
      ApiGRPCLayer.Dependencies.all ++
      ApplicationLayer.Dependencies.all ++
      InfrastructureLayer.Dependencies.all)
  )
