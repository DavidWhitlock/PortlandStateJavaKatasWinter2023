package edu.pdx.cs410J.room18;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.CoreMatchers.*;

public class LeapYearRoom18Test
{

  @Test
  void canInstantiateKataClass() {
    new LeapYearRoom18();
  }

  @Test
  void YearNotDivisibleBy4ItIsFalse() {
    int notLeapYear = 2018;
    int LeapYear = 2016;
    assertThat(LeapYearRoom18.LeapYearLogic.LeapYearMustBeDivisibleBy4(notLeapYear), is(false));
    assertThat(LeapYearRoom18.LeapYearLogic.LeapYearMustBeDivisibleBy4(LeapYear), is(true));
  }

  @Test
  void YearIsDivisibleBy4ButNotBy100() {
    int notLeapYear = 2400;
    int LeapYear = 2008;
    assertThat(LeapYearRoom18.LeapYearLogic.yearDivisibleBy4ButNot100IsALeapYear(notLeapYear), is(false));
    assertThat(LeapYearRoom18.LeapYearLogic.yearDivisibleBy4ButNot100IsALeapYear(LeapYear), is(true));
  }

  @Test
  void YearIsDivisibleBy100ButNotBy400() {
    int notLeapYear = 2400;
    int LeapYear = 2100;
    assertThat(LeapYearRoom18.LeapYearLogic.yearDivisibleBy100ButNot400IsNotLeapYear(notLeapYear), is(false));
    assertThat(LeapYearRoom18.LeapYearLogic.yearDivisibleBy100ButNot400IsNotLeapYear(LeapYear), is(true));
  }

  @Test
  void YearDivisibleBy400IsLeapYear() {
    int notLeapYear = 1999;
    int LeapYear = 2000;
    assertThat(LeapYearRoom18.LeapYearLogic.yearDivisibleBy400IsALeapYear(notLeapYear), is(false));
    assertThat(LeapYearRoom18.LeapYearLogic.yearDivisibleBy400IsALeapYear(LeapYear), is(true));
  }
}
