package edu.luc.etl.cs313.scala.simplebatch.model

trait OutputStrategy {
  def print(text: String): Unit
}

trait AbstractBatchTask extends Runnable {

  val output: OutputStrategy

  val lineSeparator = System.getProperty("line.separator")

  protected def print(text: String): Unit = { output.print(text) }

  protected def println(): Unit = { output.print(lineSeparator) }

  protected def println(text: String): Unit = {
    print(text)
    println()
  }
}
