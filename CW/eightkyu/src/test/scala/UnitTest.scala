import org.scalatest.funsuite._

class UnitTest extends AnyFunSuite {

   test("SquareNSum") {
    assert(SquareNSum.squareSum(List(1,2)) === 5)
    assert(SquareNSum.squareSum(List(0, 3, 4, 5)) === 50)
    assert(SquareNSum.squareSum(List()) === 0)
  }

  test("SquareNSum2") {
    assert(SquareNSum.squareSum2(List(1, 2)) === 5)
    assert(SquareNSum.squareSum2(List(0, 3, 4, 5)) === 50)
    assert(SquareNSum.squareSum2(List()) === 0)
  }

  test("GrasshopperSummation") {
    assert(GrasshopperSummation.summation(1) === 1)
    assert(GrasshopperSummation.summation(8) === 36)
  }

  test("GrasshopperSummation2") {
    assert(GrasshopperSummation.summation2(1) === 1)
    assert(GrasshopperSummation.summation2(8) === 36)
  }

  test("RemoveStringSpaces") {
    assert(RemoveStringSpaces.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B") === "8j8mBliB8gimjB8B8jlB")
    assert(RemoveStringSpaces.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd") === "88Bifk8hB8BB8BBBB888chl8BhBfd")
    assert(RemoveStringSpaces.noSpace("8aaaaa dddd r     ") === "8aaaaaddddr")
    assert(RemoveStringSpaces.noSpace("jfBm  gk lf8hg  88lbe8 ") === "jfBmgklf8hg88lbe8")
    assert(RemoveStringSpaces.noSpace("8j aam") === "8jaam")
  }

  test("MostRepeatedChar") {
    //assert(MostRepeatedCharacter.mostRepeatedChar("poornima") === 'o')
    assert(MostRepeatedCharacter.mostRepeatedChar("pppkkksssaaaa") === 'a')
    assert(MostRepeatedCharacter.mostRepeatedChar("pppkkksss222222aaaa") === '2')
  }
  test("MostRepeatedCharHashMap") {
    assert(MostRepeatedCharacter.mostRepeatedCharUsingHashMap("poornima") === 'o')
    assert(MostRepeatedCharacter.mostRepeatedChar("pppkkksssaaaa") === 'a')
    assert(MostRepeatedCharacter.mostRepeatedChar("  pppkkksss     aaaa") === ' ')
    assert(MostRepeatedCharacter.mostRepeatedCharUsingHashMap("pppkkksss222222aaaa") === 'a')
    assert(MostRepeatedCharacter.mostRepeatedCharUsingHashMap("pppkkksss222#1@@@@@@@@@222aaaaDDDDDDDDDD") === 'D')
    assert(MostRepeatedCharacter.mostRepeatedCharUsingHashMap("pppkkksss222#1@@@@@@@@@222aaaaDDDDDDDDDD") === 'D')
  }

  test("PlusOne") {
    assert(PlusOne.plusOneFn(Array(4,3,2,1)) === Array(4,3,2,2))
    assert(PlusOne.plusOneFn(Array(4,3,2,9)) === Array(4,3,3,0))
    assert(PlusOne.plusOneFn(Array(4,3,9,9)) === Array(4,4,0,0))
    assert(PlusOne.plusOneFn(Array(4,9,9,9)) === Array(5,0,0,0))
  }

  test("LicenseKeyFormatting") {
    assert(LicenseKeyFormatting.formatLicenseKey("5F3Z-2e-9-w", 4) === "5F3Z-2E9W")
    assert(LicenseKeyFormatting.formatLicenseKey("2-5g-3-J", 2) === "2-5G-3J")
    assert(LicenseKeyFormatting.formatLicenseKey("22-5grQ-3csw-JRw", 3) === "2-25G-RQ3-CSW-JRW")
  }

  test("SubarrayWithLeastAverage") {
    assert(SubarrayWithLeastAverage.findSubArrayWithLeastAverage(Array(12, 34, 20, 30, 24, 45), 3) === "Sub-Array of [0, 2] has a minimum average.")
    assert(SubarrayWithLeastAverage.findSubArrayWithLeastAverage(Array(42, 20, 15, 26, 10, 33), 3) === "Sub-Array of [2, 4] has a minimum average.")
    assert(SubarrayWithLeastAverage.findSubArrayWithLeastAverage(Array(40, 20, 10, 30, 10, 50), 2) === "Sub-Array of [1, 2] has a minimum average.")
    assert(SubarrayWithLeastAverage.findSubArrayWithLeastAverage(Array(3, 7, 90, 20, 10, 50, 40), 3) === "Sub-Array of [3, 5] has a minimum average.")
  }

  test("ContainsDuplicate") {
    assert(ContainsDuplicate.containsDuplicateFn(Array(1,2,3,1)) === true)
    assert(ContainsDuplicate.containsDuplicateFn(Array(1,2,3,4)) === false)
    assert(ContainsDuplicate.containsDuplicateFn(Array(1,1,1,3,3,4,3,2,4,2)) === true)
  }

  test("ContainsDuplicateOptimized") {
    assert(ContainsDuplicate.containsDuplicateFnOptimized(Array(1, 2, 3, 1)) === true)
    assert(ContainsDuplicate.containsDuplicateFnOptimized(Array(1, 2, 3, 4)) === false)
    assert(ContainsDuplicate.containsDuplicateFnOptimized(Array(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)) === true)
  }

  test("ValidAnagram") {
    assert(ValidAnagram.isAnagram("anagram", "nagaram") === true)
    assert(ValidAnagram.isAnagram("rat", "car") === false)
    assert(ValidAnagram.isAnagram("brush", "shrub") === true)
    assert(ValidAnagram.isAnagram("angered", "enraged") === true)
    assert(ValidAnagram.isAnagram("hello", "world") === false)
    assert(ValidAnagram.isAnagram("hellos", "world") === false)
  }

  test("ValidAnagram2") {
    assert(ValidAnagram.isAnagram2("anagram", "nagaram") === true)
    assert(ValidAnagram.isAnagram2("rat", "car") === false)
    assert(ValidAnagram.isAnagram2("brush", "shrub") === true)
    assert(ValidAnagram.isAnagram2("angered", "enraged") === true)
    assert(ValidAnagram.isAnagram2("hello", "world") === false)
    assert(ValidAnagram.isAnagram2("hellos", "world") === false)
  }
}