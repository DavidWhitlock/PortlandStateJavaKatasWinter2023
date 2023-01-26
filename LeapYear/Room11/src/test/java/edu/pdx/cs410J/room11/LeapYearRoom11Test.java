package edu.pdx.cs410J.room11;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearRoom11Test
{
  @Test
  void is2000ALeapYear() {
    assertLeapYear(2000);
  }

  private static void assertLeapYear(int year) {
    assertTrue(LeapYearRoom11.isYearALeapYear(year));
  }

  @Test
  void isDivisibleBy400IsLeap() {
    assertLeapYear(400);
  }

  @Test
  void isNotDivisibleBy4IsNormal() {
    assertFalse(LeapYearRoom11.isYearALeapYear(401));
  }

  @Test
  void isDivisibleBy100ButNot400BIsNormal() {
    assertFalse(LeapYearRoom11.isYearALeapYear(100));
  }

  @Test
  void isDivisibleBy4ButNot100IsLeap() {
    assertLeapYear(4);
  }

  @Test
  void isDivisibleBy4IsNormal() {
    assertFalse(LeapYearRoom11.isYearALeapYear(5));
  }
}
