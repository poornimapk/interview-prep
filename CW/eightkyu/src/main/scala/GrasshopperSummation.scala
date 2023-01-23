object GrasshopperSummation {
  def summation(n: Int): Int = {
    var sum = 0
    for(i <- 1 to n)
      sum = sum + i
    sum
  }

  def summation2(n: Int): Int = (1 to n).sum
}
