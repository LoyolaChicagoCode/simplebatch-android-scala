package edu.luc.etl.cs313.scala.simplebatch.model

/** An output strategy abstraction for batch tasks. */
trait OutputStrategy {
  def print(text: String): Unit
}

/**
 * A batch task abstraction that provides various print methods to its
 * concrete implementations.
 */
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
