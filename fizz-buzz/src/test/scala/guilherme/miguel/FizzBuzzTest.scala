package guilherme.miguel

import org.scalatest.{BeforeAndAfterEach, FlatSpec, Matchers}

/**
  * FizzBuzz test.
  *
  * @author Miguel Guilherme
  */
class FizzBuzzTest extends FlatSpec with Matchers with BeforeAndAfterEach {

  var fizzBuzz: FizzBuzz = _

  override protected def beforeEach() = fizzBuzz = new FizzBuzz

  behavior of "FizzBuzz"

  it should "retrieve 1" in {
    fizzBuzz.number(1) shouldBe "1"
  }

  it should "retrieve fizz" in {
    fizzBuzz.number(3) shouldBe "fizz"
  }

  it should "retrieve buzz" in {
    fizzBuzz.number(5) shouldBe "buzz"
  }

  behavior of "FizzBuzz range"

  it should "retrieve the correct output" in {
    fizzBuzz.range(1, 20) shouldBe "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz"
  }

}
