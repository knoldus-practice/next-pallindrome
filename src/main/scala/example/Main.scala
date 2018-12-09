package example

import java.math.BigInteger

object Main {
  def main(args: Array[String]): Unit = {

  }

  def nextPallindrome(num: String): String = {
    val len = num.length
    val left = num.substring(0, len / 2)
    val middle = num.substring(len / 2, len - len / 2)
    val right = num.substring(len - len / 2)

    if (right.compareTo(left.reverse) < 0) {
      left + middle + left.reverse
    } else {
      val next = new BigInteger(left + middle).add(BigInteger.ONE).toString
      next.substring(0, left.length + middle.length) + next.reverse.substring(middle.length)
    }
  }
}
