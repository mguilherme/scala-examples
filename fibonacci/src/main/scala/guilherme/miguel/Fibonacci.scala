package guilherme.miguel

import scala.annotation.tailrec

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

  /**
    * Calculate Fibonacci number with tail recursion.
    *
    * @param n number to calculate Fibonacci.
    * @return the Fibonacci number
    */
  def fibonacciTailRecursive(n: Int): Int = {

    @tailrec
    def tailHelper(n: Int, prev: Int = 0, next: Int = 1): Int = n match {
      case 0 => prev
      case 1 => next
      case _ => tailHelper(n - 1, next, next + prev)
    }

    tailHelper(n)
  }

  /**
    * Retrieves a string with numbers for a given range and operation.
    *
    * @param range     the given range
    * @param operation the operation
    * @return A comma separated String
    */
  def range(range: Range, operation: Int => Int): String = range.map(operation).map(_.toString).mkString(", ")

}
