object SquareNSum {
  def squareSum(xs: List[Int]): Int = xs.foldLeft(0)((acc, num) => acc + (num * num))
}
