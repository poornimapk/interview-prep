//You have given an integer array and a number k. The problem statement asks to find the subarray with least average, which is to find out the sub-array of k elements, which has the minimum average.
// Input:
//arr[] = {12, 34, 20, 30, 24, 45}
//k = 3
// Output:
//Sub-Array of [0, 2] has a minimum average.

// Input:
//arr[] = {42, 20, 15, 26, 10, 33}
//k = 3
// Output:
//Sub-Array of [2, 4] has a minimum average.

object SubarrayWithLeastAverage {
  def findSubArrayWithLeastAverage(nums: Array[Int], k: Int): String = {
    var start = 0
    var leastSum = 0
    for(i <- start to k - 1)
      leastSum = leastSum + nums(i)
    for(i <- 1 to nums.length - k) {
      var j = i
      var l = j + k - 1
      var sum = 0
      while (j <= l) {
        sum = sum + nums(j)
        j = j + 1
      }
      if(leastSum > sum){
        leastSum = sum
        start = i
      }
    }
    val end = start + k - 1
    s"Sub-Array of [$start, $end] has a minimum average."
  }
}
