import sbt._
import sbt.Keys.{libraryDependencies, name}
import sbt.{ModuleID, file}

object ApiRESTLayer {
  val apiRESTLayer = (project in file("api.rest"))
    .dependsOn(CoreDomain.coreDomain)
    .dependsOn(InfrastructureLayer.infrastructureLayer)
    .dependsOn(ApplicationLayer.applicationLayer)
    .settings(
      name := "visity:apiRESTLayer",
      libraryDependencies ++= (ApiRESTLayer.Dependencies.all ++
        ApplicationLayer.Dependencies.all ++
        InfrastructureLayer.Dependencies.all)
    )

  object Dependencies {
    val all: Seq[ModuleID] = Seq()
  }
}
