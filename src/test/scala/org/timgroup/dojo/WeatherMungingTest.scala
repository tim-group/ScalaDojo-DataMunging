package org.timgroup.dojo

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class WeatherMungingTest extends FunSuite with ShouldMatchers with ReadFile {
  test("Determines the team with the smallest spread between for and agains") {
    val dayWithSmallestTemperatureSpread = WeatherMunging(readFile("weather.dat")).dayWithTheSmallestTemperatureSpread

    dayWithSmallestTemperatureSpread should be(14)
  }
}
