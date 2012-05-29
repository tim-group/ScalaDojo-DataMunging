package org.timgroup.dojo

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class FootballMungingTest extends FunSuite with ShouldMatchers with ReadFile {


  test("The team with smallest difference between for and against is Aston Villa") {
    val teamWithTheSmallestDifferenceBetweenForAndAgainst = FootballMunging(readFile("football.dat"))
      .teamWithTheSmallestDifferenceBetweenForAndAgainst

    teamWithTheSmallestDifferenceBetweenForAndAgainst should be("Aston_Villa")
  }
}
