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

    val strNumber = number.toString

    number == strNumber.map(_.asDigit).toList.map(math.pow(_, strNumber.length)).sum
  }

}
