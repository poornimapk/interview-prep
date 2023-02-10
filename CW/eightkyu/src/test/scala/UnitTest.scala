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
}