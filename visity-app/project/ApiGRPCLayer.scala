import sbt._
import sbt.Keys.{libraryDependencies, name}
import sbt.{ModuleID, file}

object ApiGRPCLayer {
  val apiGRPCLayer: Project = (project in file("api.grpc"))
    .dependsOn(CoreDomain.coreDomain)
    .dependsOn(InfrastructureLayer.infrastructureLayer)
    .dependsOn(ApplicationLayer.applicationLayer)
    .settings(
      name := "visity:apiGRPCLayer",
      libraryDependencies ++= (ApiGRPCLayer.Dependencies.all ++
        ApplicationLayer.Dependencies.all ++
        InfrastructureLayer.Dependencies.all)
    )

  object Dependencies {
    val all: Seq[ModuleID] = Seq()
  }
}
