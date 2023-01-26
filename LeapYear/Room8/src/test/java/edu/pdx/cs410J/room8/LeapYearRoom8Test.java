package edu.pdx.cs410J.room8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearRoom8Test
{

  @Test
  void canInstantiateKataClass() {
    new LeapYearRoom8();
  }


  @Test
  void testCheckForLeapYearPositivecases() {
    assertTrue(LeapYearRoom8.checkForLeapYear(2000));
    assertTrue(LeapYearRoom8.checkForLeapYear(2008));
    assertTrue(LeapYearRoom8.checkForLeapYear(2012));
    assertTrue(LeapYearRoom8.checkForLeapYear(2016));

  }

  @Test
  void testCheckForLeapYearNegativecases() {
    assertFalse(LeapYearRoom8.checkForLeapYear(1700));
    assertFalse(LeapYearRoom8.checkForLeapYear(1800));
    assertFalse(LeapYearRoom8.checkForLeapYear(1900));
    assertFalse(LeapYearRoom8.checkForLeapYear(2100));
    assertFalse(LeapYearRoom8.checkForLeapYear(2017));
    assertFalse(LeapYearRoom8.checkForLeapYear(2018));
    assertFalse(LeapYearRoom8.checkForLeapYear(2019));
  }




}
