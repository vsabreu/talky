import sbt.{ModuleID, file, _}
import sbt.Keys.{libraryDependencies, name}

object InfrastructureLayer {
  val infrastructureLayer = (project in file("infrastructure"))
    .settings(
      name := "talky:infrastructureLayer",
      libraryDependencies ++= InfrastructureLayer.Dependencies.all
    )

  object Dependencies {
    val all: Seq[ModuleID] = (
      Logging.dependencies ++ Testing.Dependencies.all
    )
  }

  private object Logging {
    private val LogbackVersion = "1.2.3"
    private val Logback = "ch.qos.logback" % "logback-classic" % LogbackVersion

    val dependencies: Seq[ModuleID] = Seq(
      Logback
    )
  }
}
