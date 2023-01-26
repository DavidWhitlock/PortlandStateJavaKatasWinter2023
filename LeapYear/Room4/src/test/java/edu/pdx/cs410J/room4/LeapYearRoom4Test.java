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
  void yearIsLeapYear(){
    int[] isLeapYears = new int[] {2012, 2016, 2000};
    for (int i = 0; i < isLeapYears.length; i++) {
      assertThat(LeapYearRoom4.LeapYearRoom4Input(isLeapYears[i]), equalTo("LEAP YEAR"));
    }
  }
  @Test
  void yearIsNotLeapYear() {
    int[] notLeapYears = new int[] {1700, 2019, 1855};
    for (int i = 0; i < notLeapYears.length; i++) {
      assertThat(LeapYearRoom4.LeapYearRoom4Input(notLeapYears[i]), equalTo("NOT LEAP YEAR"));
    }
  }
}
