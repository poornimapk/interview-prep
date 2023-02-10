//In the problem “License Key Formatting”, the input consists of a string of characters, representing a license key. Initially, the string is separated into N + 1 groups(words) by N dashes in between. We are also given an integer K, and the goal is to format the string such that every group contains exactly K characters, except for the first one, which is allowed to characters less than K. Furthermore, the groups must be separated by ‘-‘(dash) and have only uppercase letters.

// Input: S = "5F3Z-2e-9-w", K = 4
// Output 5F3Z-2E9W

// Input: S = "2-5g-3-J", K = 2
// Output 2-5G-3J
object LicenseKeyFormatting {
  def formatLicenseKey(inString: String, K: Int): String = {
    val tmpString = inString.filterNot(_.equals('-'))
    var result: String = ""
    var counter = 0
    for(i <- tmpString.length - 1 to (0, -1)) {
      if(counter == K){
        counter = 0
        result = "-".concat(result)
      }
      val tmp = tmpString(i).toUpper
      result = tmp.toString.concat(result)
      counter = counter + 1
    }
    result
  }
}
