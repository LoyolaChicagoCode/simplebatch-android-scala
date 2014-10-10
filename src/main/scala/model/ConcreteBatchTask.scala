package edu.luc.etl.cs313.scala.simplebatch.model

/**
 * The concrete task of printing the first n squares using the
 * provided output strategy.
 */
class ConcreteBatchTask(val output: OutputStrategy) extends AbstractBatchTask {

  def run(): Unit = {
    println("table of squares")
    println()
    for (i <- 0 to 100)
      println(i + "^2 = " + i * i)
  }
}
