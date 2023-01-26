package edu.pdx.cs410J.room19;

import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearRoom19Test
{

  @Test
  void canInstantiateKataClass() {
    new LeapYearRoom19();
  }

  @Test
  void divisibleByFourHundredIsLeapYear(){
    assertTrue(LeapYearRoom19.isLeapYear("2000"));
  }

  @Test
  void divisibleByOneHundredButNotFourHundredIsNotLeapYear(){
    assertFalse(LeapYearRoom19.isLeapYear("1900"));
  }

  @Test
  void divisibleByFourButNotOneHundredIsLeapYear(){
    assertTrue(LeapYearRoom19.isLeapYear(("2004")));
  }

  @Test
  void notDivisibleByFourOrFourHundredIsNotLeapYear(){
    assertFalse(LeapYearRoom19.isLeapYear(("2003")));
  }
}
