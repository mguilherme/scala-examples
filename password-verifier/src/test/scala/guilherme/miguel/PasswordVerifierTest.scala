package guilherme.miguel

import org.scalatest.{BeforeAndAfterEach, FlatSpec, Matchers}

/**
  * Password verifier test.
  *
  * @author Miguel Guilherme
  */
class PasswordVerifierTest extends FlatSpec with Matchers with BeforeAndAfterEach {

  var pwdVerifier: PasswordVerifier = _

  override protected def beforeEach(): Unit = pwdVerifier = new PasswordVerifier

  behavior of "PasswordVerifier"

  it should "throw: password should be larger than 8 chars" in {
    the[IllegalArgumentException] thrownBy {
      pwdVerifier verify "Secret1"
    } should have message "password should be larger than 8 chars"
  }

  it should "throw: password should not be null" in {
    the[IllegalArgumentException] thrownBy {
      pwdVerifier verify null
    } should have message "password should not be null"
  }

  it should "throw: password should have one uppercase letter at least" in {
    the[IllegalArgumentException] thrownBy {
      pwdVerifier verify "mypassword"
    } should have message "password should have one uppercase letter at least"
  }

  it should "throw: password should have one lowercase letter at least" in {
    the[IllegalArgumentException] thrownBy {
      pwdVerifier verify "MYPASSWORD"
    } should have message "password should have one lowercase letter at least"
  }

  it should "throw: password should have one number at least" in {
    the[IllegalArgumentException] thrownBy {
      pwdVerifier verify "myPassword"
    } should have message "password should have one number at least"
  }

}
