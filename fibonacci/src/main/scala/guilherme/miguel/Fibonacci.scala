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

  /**
    * Retrieves a string with numbers for a given range and operation.
    *
    * @param range     the given range
    * @param operation the operation
    * @return A comma separated String
    */
  def range(range: Range, operation: Int => Int): String = range.map(operation).map(_.toString).mkString(", ")

}
