import sbt.{ModuleID, file, _}
import sbt.Keys.{libraryDependencies, name}
import sbt.librarymanagement.ModuleID

object Testing {
  object Dependencies {
    private val ScalaTestVersion = "3.0.8"
    private val ScalaTest = "org.scalatest" %% "scalatest" % ScalaTestVersion % Test

    val all: Seq[ModuleID] = Seq(
      ScalaTest
    )
  }
}
