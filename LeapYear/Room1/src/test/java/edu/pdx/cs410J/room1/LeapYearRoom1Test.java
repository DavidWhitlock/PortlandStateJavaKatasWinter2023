package edu.pdx.cs410J.room1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearRoom1Test
{

  @Test
  void canInstantiateKataClass() {
    new LeapYearRoom1();
  }
  @Test
  @Disabled
  void theYear2000IsALeapYear(){
    boolean result = LeapYearRoom1.isLeapYear(2000);
    assertTrue(result);
  }

  @Test
  void theYear1900IsNotALeapYear(){
    boolean result = LeapYearRoom1.isLeapYear(1900);
    assertFalse(result);
  }



}
