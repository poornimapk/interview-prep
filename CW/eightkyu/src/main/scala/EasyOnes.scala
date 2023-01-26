object EasyOnes {
  def stringToNumber(s: String): Int = s.toIntOption.getOrElse(0)

  def countSheep(sheep: Array[Boolean]): Int = sheep.filter(sh => sh).length

  def digitize(n: Long): Seq[Int] = {
    val nToString = n.toString
    val reversedString = nToString.split("").reverse
    val reversedStrToInt = reversedString.map(str => str.toInt)
    reversedStrToInt.toSeq
  }

  def digitize2(n: Long): Seq[Int] = n.toString.map(_.asDigit).reverse

  def abbrevName(name: String): String = name.split(' ').map(_.toLowerCase.capitalize).map(str => str(0)).mkString(".")

  def sumFrom1To20(): Int = {
    var res = 0
    for(i <- 1 to 20)
      res = res + i
    res
  }

}
