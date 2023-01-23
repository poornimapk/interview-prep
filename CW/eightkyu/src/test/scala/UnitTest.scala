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
}