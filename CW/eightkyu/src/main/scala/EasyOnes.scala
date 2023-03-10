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

  def areYouPlayingBanjo(name: String): String = name match {
    case r if(name.startsWith("R") || name.startsWith("r")) => s"$name plays banjo"
    case _ => s"$name does not play banjo"
  }

  def countPositivesSumNegatives(integers: Array[Int]): (Int, Int) = {
    var count = 0
    var sum = 0
    integers.map(integer => {
      if(integer.abs == integer && integer != 0) count = count + 1
      else sum = sum + integer
    })
    (count, sum)
  }

  def barTriang(pointA: (Int, Int), pointB: (Int, Int), pointC: (Int, Int)): (Double, Double) = {
    (
      roundAt(((pointA._1.toDouble + pointB._1.toDouble + pointC._1.toDouble) / 3), 4),
      roundAt(((pointA._2.toDouble + pointB._2.toDouble + pointC._2.toDouble) / 3), 4)
    )
  }

  def roundAt(n: Double, at: Int): Double = {
    val tmp = math pow(10, at)
    (math round n * tmp) / tmp
  }
}
