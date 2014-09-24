package edu.luc.etl.cs313.scala.simplebatch.model

class ConcreteBatchTask(val output: OutputStrategy) extends AbstractBatchTask {

  def run(): Unit = {
    println("table of squares")
    println()
    for (i <- 0 to 100)
      println(i + "^2 = " + i * i)
  }
}
