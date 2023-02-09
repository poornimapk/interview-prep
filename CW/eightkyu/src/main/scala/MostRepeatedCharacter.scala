import scala.collection.mutable.HashMap

// Find most repeated alphabet in a string, skip numbers and special characters
object MostRepeatedCharacter {

  def mostRepeatedChar(string: String): Char = {
    val counter = new Array[Int](256)
    for (i <- 0 to string.length - 1)
      counter(string.charAt(i)) = counter(string.charAt(i)) + 1
    println(counter)
    var maxCount = -1
    var maxChar = ' '
    for (i <- 0 to string.length - 1) {
      if (maxCount < counter(string.charAt(i))) {
        maxCount = counter(string.charAt(i))
        println(maxCount)
        maxChar = string.charAt(i)
        println(maxChar)
      }
    }
    maxChar
  }

  def mostRepeatedCharUsingHashMap(string: String): Char = {
    var myMap: HashMap[Char, Int] = HashMap()
    var maxChar:Char = ' '
    for(i <- 0 to string.length - 1) {
      val key = string.charAt(i)
      val isASCIILetter: Boolean = (key >= 'a' && key <= 'z') || (key >= 'A' && key <= 'Z')
      if(isASCIILetter) {
        var keyCount = myMap.get(key).getOrElse(0)
        keyCount = keyCount + 1
        myMap(key) = keyCount
        if (maxChar == ' ' || myMap(key) > myMap(maxChar)) maxChar = key
      }
    }
    maxChar
  }
}
