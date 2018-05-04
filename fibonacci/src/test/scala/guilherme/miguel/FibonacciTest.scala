package guilherme.miguel

import org.scalatest.{BeforeAndAfterEach, FlatSpec, Matchers}

/**
  * Fibonacci test.
  *
  * @author Miguel Guilherme
  */
class FibonacciTest extends FlatSpec with Matchers with BeforeAndAfterEach {

  var fibonacci: Fibonacci = _

  val Expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377"

  override protected def beforeEach(): Unit = fibonacci = new Fibonacci

  behavior of "Fibonacci"

  it should "retrieve the expected string output" in {
    range(fibonacci.fibonacci) shouldBe Expected
  }

  /**
    * Retrieves a String with numbers from 0 to 14 for a given operation.
    * @param operation the operation
    * @return A comma separated String
    */
  def range(operation: Int => Int): String = {
    (0 until 15).map(operation).map(_.toString).mkString(", ")
  }


}
