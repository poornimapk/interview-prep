//In the problem ” Plus One”  we are given an array where each element in the array represents a digit of a number. The complete array represents a number. The zeroth index represents the MSB of the number.  We can assume that there is no leading zero in the number.
//
//Our task is to plus one the given number and then return the result in the form of an array.
// only single digits will be there in the array

object PlusOne {
  def plusOneFn(digits: Array[Int]): Array[Int] = {
    var quitLoop = false
    var i = digits.length - 1
    while(!quitLoop) {
      if(digits(i) < 9) {
        digits(i) = digits(i) + 1
        quitLoop = true
      } else {
        digits(i) = 0
      }
      i = i - 1
    }
    digits
  }
}
