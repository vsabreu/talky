import sbt._
import sbt.Keys.{libraryDependencies, name}
import sbt.{ModuleID, file}

object ApplicationLayer {
  val applicationLayer = (project in file("application"))
    .dependsOn(CoreDomain.coreDomain)
    .dependsOn(InfrastructureLayer.infrastructureLayer)
    .settings(
      name := "talky:applicationLayer",
      libraryDependencies ++= (ApplicationLayer.Dependencies.all ++
        CoreDomain.Dependencies.all ++
        InfrastructureLayer.Dependencies.all)
    )

  object Dependencies {
    val all: Seq[ModuleID] = Seq()
  }
}
