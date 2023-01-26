package edu.pdx.cs410J.room4;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearRoom4Test
{

  @Test
  void canInstantiateKataClass() {

    new LeapYearRoom4();
  }


  @Test
  void yearISLeapYear(){
    assertThat(LeapYearRoom4.LeapYearRoom4Input(2000), equalTo("LEAP YEAR"));
  }
}
