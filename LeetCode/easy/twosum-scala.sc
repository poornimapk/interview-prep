object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    nums.zipWithIndex.
      filter(x =>
        (nums.take(nums.indexOf(x._1)) ++ nums.drop(nums.indexOf(x._1)+1))
          .contains(target - x._1)).map(_._2)
  }
}