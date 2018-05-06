package guilherme.miguel

import org.scalatest.{BeforeAndAfterEach, FlatSpec, Matchers}

/**
  * Password verifier test.
  *
  * @author Miguel Guilherme
  */
class PasswordVerifierTest extends FlatSpec with Matchers with BeforeAndAfterEach {

  var passwordVerifier: PasswordVerifier = _

  override protected def beforeEach(): Unit = passwordVerifier = new PasswordVerifier

  behavior of "PasswordVerifier"

  it should "throw: password should be larger than 8 chars" in {
    val thrown = the[IllegalArgumentException] thrownBy passwordVerifier.verify("Secret1")
    thrown.getMessage should equal("password should be larger than 8 chars")
  }

  it should "throw: password should not be null" in {
    val thrown = the[IllegalArgumentException] thrownBy passwordVerifier.verify(null)
    thrown.getMessage should equal("password should not be null")
  }

  it should "throw: password should have one uppercase letter at least" in {
    val thrown = the[IllegalArgumentException] thrownBy passwordVerifier.verify("mypassword")
    thrown.getMessage should equal("password should have one uppercase letter at least")
  }

  it should "throw: password should have one lowercase letter at least" in {
    val thrown = the[IllegalArgumentException] thrownBy passwordVerifier.verify("MYPASSWORD")
    thrown.getMessage should equal("password should have one lowercase letter at least")
  }

  it should "throw: password should have one number at least" in {
    val thrown = the[IllegalArgumentException] thrownBy passwordVerifier.verify("myPassword")
    thrown.getMessage should equal("password should have one number at least")
  }

}
