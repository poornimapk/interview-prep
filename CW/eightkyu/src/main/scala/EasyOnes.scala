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
}
