package guilherme.miguel

/**
  * A Password verifications with TDD based approach.
  *
  * @author Miguel Guilherme
  */
class PasswordVerifier {

  /**
    * Performs validations for a given string.
    *
    * @param str the string to be validated
    */
  def verify(str: String): Unit = str match {
    case null => throwException("password should not be null")
    case s if s.length <= 8 => throwException("password should be larger than 8 chars")
    case s if s equals s.toLowerCase => throwException("password should have one uppercase letter at least")
    case s if s equals s.toUpperCase => throwException("password should have one lowercase letter at least")
    case s if s exists (!_.isDigit) => throwException("password should have one number at least")
  }

  /**
    * Throws an IllegalArgumentException with a given message.
    *
    * @param message the message
    * @return an IllegalArgumentException
    */
  private def throwException(message: String) = throw new IllegalArgumentException(message)

}
