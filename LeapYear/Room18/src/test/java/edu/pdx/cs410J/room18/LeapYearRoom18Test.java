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
}
