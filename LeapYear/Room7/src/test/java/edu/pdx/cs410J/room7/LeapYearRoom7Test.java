package edu.pdx.cs410J.room7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearRoom7Test {
  @Test
  void is4000LeapYear() {
    assertTrue(LeapYearRoom7.isLeapYear(4000));
  }

  @Test
  void is1700LeapYear() {
    assertFalse(LeapYearRoom7.isLeapYear(1700));
  }

  @Test
  void is2800LeapYear() {
    assertTrue(LeapYearRoom7.isLeapYear(2880));
  }

  @Test
  void is2017LeapYear() {
    assertFalse(LeapYearRoom7.isLeapYear(2017));
  }

  @Test
  void is223LeapYear() {
    assertFalse(LeapYearRoom7.isLeapYear(223));
  }

  @Test
  void is2100LeapYear() {
    assertFalse(LeapYearRoom7.isLeapYear(2100));
  }

  @Test
  void is0LeapYear() {
    assertTrue(LeapYearRoom7.isLeapYear(0));
  }
}
