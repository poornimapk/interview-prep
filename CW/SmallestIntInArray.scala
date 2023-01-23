package codewars.eightkyu

class SmallestIntInArray {
  def findSmallestInt(nums: List[Int]): Int = {
    var smallest = Integer.MAX_VALUE
    for (i <- 0 until nums.length)
      smallest = nums(i).min(smallest)
    smallest
  }

  def findSmallestInt2(nums: List[Int]): Int = nums.min
}
