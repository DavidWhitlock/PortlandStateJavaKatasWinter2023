package edu.pdx.cs410J.room6;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class LeapYearRoom6Test
{

  @Test
  void canInstantiateKataClass() {
    new LeapYearRoom6();
  }
  @Test
  void ifDivisibleByFourOutputLeapYear(){
    boolean result = LeapYearRoom6.isLeapYear(4);
    assertThat(result, equalTo(true));
  }

  @Test
  void ifYearNotDivisibleByFourDoNotOutputLeapYear(){
    boolean result = LeapYearRoom6.isLeapYear(5);
    assertThat(result,equalTo(false));
  }

  @Test
  void ifYearDivisibleByFourButNotHundredIsLeapYear() {
    boolean result = LeapYearRoom6.isLeapYear(2024);
    assertThat(result, equalTo(true));
  }

  @Test
  void ifYearDivisibleByFourAndHundredIsNotLeapYear() {
    boolean result = LeapYearRoom6.isLeapYear(100);
    assertThat(result, equalTo(false));
  }

  @Test
  void isYearDivisibleByFourHundredsLeapYear() {
    boolean result = LeapYearRoom6.isLeapYear(400);
    assertThat(result, equalTo(true));
  }
}
