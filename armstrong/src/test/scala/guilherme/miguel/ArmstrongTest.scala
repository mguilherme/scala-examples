package guilherme.miguel

import org.scalatest.{BeforeAndAfterEach, FlatSpec, Matchers}


/**
  * Armstrong test.
  *
  * @author Miguel Guilherme
  */
class ArmstrongTest extends FlatSpec with Matchers with BeforeAndAfterEach {

  var armstrong: Armstrong = _

  override protected def beforeEach(): Unit = armstrong = new Armstrong

  behavior of "isArmstrong"

  it should "retrieve true for 153" in {
    armstrong.isArmstrong(153) shouldBe true
  }

  it should "retrieve true for 371" in {
    armstrong.isArmstrong(371) shouldBe true
  }

  it should "retrieve true for 9474" in {
    armstrong.isArmstrong(9474) shouldBe true
  }

  it should "retrieve true for 54748" in {
    armstrong.isArmstrong(54748) shouldBe true
  }

  it should "retrieve false for 100" in {
    armstrong.isArmstrong(100) shouldBe false
  }

}
