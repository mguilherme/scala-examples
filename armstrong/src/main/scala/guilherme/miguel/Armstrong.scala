package guilherme.miguel

/**
  * Armstrong number.
  *
  * @author Miguel Guilherme
  */
class Armstrong {

  /**
    * Check if a number is Armstrong.
    *
    * @param number number number to check if Armstrong
    * @return true if Armstrong, false otherwise
    */
  def isArmstrong(number: Int): Boolean = {

    val string = number.toString

    number == string.map(n => math.pow(n.asDigit, string.length)).sum
  }

}
