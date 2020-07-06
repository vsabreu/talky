import sbt._

object ApiGRPCLayer {
  val dependencies: Seq[ModuleID] = Seq()
}

object ApiRESTLayer {
  val dependencies: Seq[ModuleID] = Seq()
}

object ApplicationLayer {
  val dependencies: Seq[ModuleID] = Seq()
}

object CoreDomain {
  val dependencies: Seq[ModuleID] = Seq()
}

object TestDependencies {
  private val ScalaTestVersion = "3.0.8"
  private val ScalaTest = "org.scalatest" %% "scalatest" % ScalaTestVersion % Test

  val all: Seq[ModuleID] = Seq(
    ScalaTest
  )
}

object InfrastructureLayer {
  val dependencies: Seq[ModuleID] = (
    Logging.dependencies
  )

  private object Logging {
    private val LogbackVersion = "1.2.3"
    private val Logback = "ch.qos.logback" % "logback-classic" % LogbackVersion

    val dependencies: Seq[ModuleID] = Seq(
      Logback
    )
  }
}

