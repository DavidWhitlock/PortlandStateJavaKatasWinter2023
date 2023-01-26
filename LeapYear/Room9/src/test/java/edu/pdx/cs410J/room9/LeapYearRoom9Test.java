package edu.pdx.cs410J.room9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearRoom9Test
{

  @Test
  int year = 400;
  void isDivisibleBy400(){
    leapYearTest(400);
  }

  private static void leapYearTest(int year) {
    assertTrue(LeapYearRoom9.isLeapYear(int year));
  }

}
