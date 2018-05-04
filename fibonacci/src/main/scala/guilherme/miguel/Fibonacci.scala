package guilherme.miguel

/**
  * Fibonacci numbers.
  *
  * @author Miguel Guilherme
  */
class Fibonacci {

  /**
    * Calculate Fibonacci number.
    *
    * @param n number to calculate Fibonacci.
    * @return the Fibonacci number
    */
  def fibonacci(n: Int): Int = n match {
    case 0 | 1 => n
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

}
