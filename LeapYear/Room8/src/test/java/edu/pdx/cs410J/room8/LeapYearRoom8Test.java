package edu.pdx.cs410J.room8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearRoom8Test
{

  @Test
  void canInstantiateKataClass() {
    new LeapYearRoom8();
  }


  @Test
  void testCheckForLeapYear() {
    assertTrue(LeapYearRoom8.checkForLeapYear(2000));
  }
}
