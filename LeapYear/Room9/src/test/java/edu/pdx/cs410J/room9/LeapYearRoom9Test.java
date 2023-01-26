package edu.pdx.cs410J.room9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearRoom9Test
{

  @Test
  void testYear400(){
    int year = 400;
    leapYearTrue(400);
  }

  @Test
  void testYear100()
  {
    int year = 100;
    leapYearFalse(year);
  }

  @Test
  void testYear4()
  {
    int year = 4;
    leapYearTrue(year);
  }

  @Test
  void testYear17(){
    int year = 17;
    leapYearFalse(year);
  }

  @Test
  void testYear2000(){
    int year = 2000;
    leapYearTrue(year);
  }

  private static void leapYearTrue(int year) {
    assertTrue(LeapYearRoom9.isLeapYear(year));
  }

  private static void leapYearFalse(int year) {
    assertTrue(!LeapYearRoom9.isLeapYear(year));
  }
}
