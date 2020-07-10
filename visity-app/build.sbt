// reload SBT shell every time a SBT change is made
Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / organization := "io.visity"
ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "0.1.0-SNAPSHOT"

scalacOptions ++= ScalacOptions.all

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
    name := "visity:root",
    libraryDependencies ++= (ApiGRPCLayer.Dependencies.all ++
      ApiGRPCLayer.Dependencies.all ++
      ApplicationLayer.Dependencies.all ++
      InfrastructureLayer.Dependencies.all)
  )
