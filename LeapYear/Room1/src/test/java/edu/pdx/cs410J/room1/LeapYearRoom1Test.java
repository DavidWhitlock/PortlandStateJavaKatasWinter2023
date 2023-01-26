package edu.pdx.cs410J.room1;

import org.junit.jupiter.api.Test;

public class LeapYearRoom1Test
{

  @Test
  void canInstantiateKataClass() {
    new LeapYearRoom1();
  }
  @Test
  void canGetFailResult(){
    boolean result = LeapYearRoom1.isLeapYear(3);
    assertThat(result, equals(false));
  }
  
}
