import org.scalatest.flatspec.AnyFlatSpec

class EasyOnesTest extends AnyFlatSpec {
  "stringToNumber" should "pass basic tests" in {
    assertResult(1234, "\nInput\n  s = \"1234\"") (EasyOnes.stringToNumber("1234"))
    assertResult(605, "\nInput\n  s = \"605\"") (EasyOnes.stringToNumber("605"))
    assertResult(1405, "\nInput\n  s = \"1405\"") (EasyOnes.stringToNumber("1405"))
    assertResult(-7, "\nInput\n  s = \"-7\"") (EasyOnes.stringToNumber("-7"))
  }

  "An array with 17 sheep" should "return 17" in {
    assertResult(17, "for Array(true,  true,  true,  false,true,  true,  true,  true, true,  false, true,  false,true,  false, false, true,true,  true,  true,  true,false, false, true,  true)") {
      EasyOnes.countSheep(Array(true, true, true, false, true, true, true, true, true, false, true, false,true, false, false, true, true, true, true, true, false, false, true, true))
    }
  }

  "digitize" should "pass basic tests" in {
    assertResult(Seq(1,3,2,5,3), "\nInput\n n = \"35231L\"")(EasyOnes.digitize(35231L))
    assertResult(Seq(0))(EasyOnes.digitize(0L))
    assertResult(Seq(4,5,3,1,0,2,3))(EasyOnes.digitize(3201354L))
  }

  "digitize2" should "pass basic tests" in {
    assertResult(Seq(1, 3, 2, 5, 3), "\nInput\n n = \"35231L\"")(EasyOnes.digitize2(35231L))
    assertResult(Seq(0))(EasyOnes.digitize2(0L))
    assertResult(Seq(4, 5, 3, 1, 0, 2, 3))(EasyOnes.digitize2(3201354L))
  }

  "abbrevName" should "pass basic tests" in {
    assertResult("S.H", "\nInput\n n = \"Sam Harris\"")(EasyOnes.abbrevName("Sam Harris"))
    assertResult("R.G", "\nInput\n n = \"rachel greene\"")(EasyOnes.abbrevName("rachel greene"))
    assertResult("R.G", "\nInput\n n = \"r geller\"")(EasyOnes.abbrevName("r geller"))
    assertResult("M.G", "\nInput\n n = \"Monica geller\"")(EasyOnes.abbrevName("Monica geller"))
    assertResult("J.T", "\nInput\n n = \"Joey t\"")(EasyOnes.abbrevName("Joey t"))
  }

  "sumFrom1To20" should "pass basic tests" in {
    assertResult(210)(EasyOnes.sumFrom1To20())
  }
}
