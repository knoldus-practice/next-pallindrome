package example

import org.scalatest._

class PallindromeSpec extends FlatSpec with Matchers {

  import Main.nextPallindrome

  "The nextPallindrome " should "work for single digits numbers" in {
    nextPallindrome("0") shouldEqual "1"
    nextPallindrome("5") shouldEqual "6"
  }

  it should "work for all even length numbers" in {
    nextPallindrome("10") shouldEqual "11"
    nextPallindrome("15") shouldEqual "22"
    nextPallindrome("21") shouldEqual "22"
    nextPallindrome("23") shouldEqual "33"
    nextPallindrome("1631") shouldEqual "1661"
    nextPallindrome("2136") shouldEqual "2222"
    nextPallindrome("1000") shouldEqual "1001"
    nextPallindrome("9992") shouldEqual "9999"
  }

  it should "work for all odd length numbers" in {
    nextPallindrome("149") shouldEqual "151"
    nextPallindrome("809") shouldEqual "818"
    nextPallindrome("123450000") shouldEqual "123454321"
    nextPallindrome("123451234") shouldEqual "123454321"
  }

  it should "work for all pallindromes" in {
    nextPallindrome("9") shouldEqual "11"
    nextPallindrome("11") shouldEqual "22"
    nextPallindrome("111") shouldEqual "121"
    nextPallindrome("131") shouldEqual "141"
  }

  it should "work for all numbers where left half is smaller than right half" in {
    nextPallindrome("1245") shouldEqual "1331"
    nextPallindrome("12345") shouldEqual "12421"
    nextPallindrome("123454322") shouldEqual "123464321"
    nextPallindrome("1992") shouldEqual "2002"
    nextPallindrome("109992") shouldEqual "110011"
    nextPallindrome("1099992") shouldEqual "1100011"
  }

  it should "work for all 9s numbers" in {
    nextPallindrome("9") shouldEqual "11"
    nextPallindrome("99") shouldEqual "101"
    nextPallindrome("999") shouldEqual "1001"
  }
}
