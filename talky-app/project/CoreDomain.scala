import sbt._
import sbt.Keys.{libraryDependencies, name}
import sbt.{ModuleID, file}

object CoreDomain {
  val coreDomain = (project in file("domain"))
    .settings(
      name := "talky:coreDomain",
      libraryDependencies ++= (CoreDomain.Dependencies.all ++ Testing.Dependencies.all)
    )

  object Dependencies {
    private val CatsCoreVersion = "2.0.0"
    private val CatsCore = "org.typelevel" %% "cats-core" % CatsCoreVersion

    val all: Seq[ModuleID] = Seq(
      CatsCore
    )
  }
}
