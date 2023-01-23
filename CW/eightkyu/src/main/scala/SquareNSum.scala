object SquareNSum {
  def squareSum(xs: List[Int]): Int = xs.foldLeft(0)((acc, num) => acc + (num * num))

  def squareSum2(xs: List[Int]): Int = xs.map(num => num * num).sum
}
