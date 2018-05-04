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
    fibonacci.range(0 until 15, fibonacci.fibonacci) shouldBe Expected
  }

}
