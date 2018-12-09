package example

import org.scalatest._

class PallindromeSpec extends FlatSpec with Matchers {
  "The nextPallindrome " should "work for single digits numbers" in {
    Main.nextPallindrome("0") shouldEqual "1"
    Main.nextPallindrome("5") shouldEqual "6"
    Main.nextPallindrome("9") shouldEqual "11"
  }
}
