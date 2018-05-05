package guilherme.miguel

/**
  * @author Miguel Guilherme
  */
object Main extends App {

  val fibonacci = new Fibonacci

  time {
    fibonacci.range(0 to 20, fibonacci.fibonacci)
  }

  time {
    fibonacci.range(0 to 20, fibonacci.fibonacciTailRecursive)
  }

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block // call-by-name
    val t1 = System.nanoTime()

    println(s"Elapsed time: ${t1 - t0}ns")
    result
  }

}
