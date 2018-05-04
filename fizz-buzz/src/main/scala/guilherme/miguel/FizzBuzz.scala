package guilherme.miguel

/**
  * Fizz Buzz Implementation.
  *
  * @author Miguel Guilherme
  */
class FizzBuzz {

  /**
    * Retrieves <b>fizz</b> for numbers that are multiples of 3,
    * <b>buzz</b> for numbers that are multiples of 5,
    * <b>fizzbuzz</b> for numbers that are multiples of 15
    *
    * @param n the number
    * @return <b>fizz</b>, <b>buzz</b>, <b>fizzbuzz</b> or the number itself
    */
  def number(n: Int): String = (n % 3, n % 5) match {
    case (0, 0) => "fizzbuzz"
    case (0, _) => "fizz"
    case (_, 0) => "buzz"
    case _ => n.toString
  }

  /**
    * Parse a range of numbers
    *
    * @param start the start number
    * @param end   the end number
    * @return a string with the multiples of 3, 5 or 15
    *         replaced with <b>fizz</b>, <b>buzz</b>, <b>fizzbuzz</b> or the number itself
    */
  def range(start: Int, end: Int): String = (start to end).map(number).mkString(" ")

}
