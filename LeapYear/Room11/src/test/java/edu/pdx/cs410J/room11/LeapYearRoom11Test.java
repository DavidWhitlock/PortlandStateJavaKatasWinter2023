package edu.pdx.cs410J.room11;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearRoom11Test
{
  @Test
  void is2000ALeapYear() {
    assertTrue(LeapYearRoom11.isYearALeapYear(2000));
  }

  @Test
  void isYearDivisibleBy400ShouldBeLeapYear() {
    assertTrue(LeapYearRoom11.isYearALeapYear(400));
  }

  @Test
  void isYearNotDivisibleBy4ShouldNotBeLeapYear() {
    assertFalse(LeapYearRoom11.isYearALeapYear(401));
  }

  @Test
  void isYearDivisibleBy100ButNotBy400BeNotALeapYear() {
    assertFalse(LeapYearRoom11.isYearALeapYear(100));
  }

  @Test
  void isYearDivisibleBy4ButNotBy100BeALeapYear() {
    assertTrue(LeapYearRoom11.isYearALeapYear(4));
  }

  @Test
  void isYearDivisibleBy4NotBeALeapYear() {
    assertFalse(LeapYearRoom11.isYearALeapYear(5));
  }
}
