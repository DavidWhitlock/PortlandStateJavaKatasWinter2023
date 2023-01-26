package edu.pdx.cs410J.room1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearRoom1Test
{

  @Test
  void canInstantiateKataClass() {
    new LeapYearRoom1();
  }
  @Test
  void canGetFailResult(){
    boolean result = LeapYearRoom1.isLeapYear(1900);
    assertEquals(result, false);
  }



}
