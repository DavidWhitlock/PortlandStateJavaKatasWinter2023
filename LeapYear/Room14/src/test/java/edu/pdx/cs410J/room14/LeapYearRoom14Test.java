package edu.pdx.cs410J.room14;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearRoom14Test
{

  @Test
  void canInstantiateKataClass() {
    new LeapYearRoom14();
  }

  @Test
  void testLeapYear400NotLeapYear() {
    assertThat(LeapYearRoom14.checkForLeapYear(400),equalTo(true));
  }

  @Test
  void testLeapYear2000IsLeapYear() {
    assertThat(LeapYearRoom14.checkForLeapYear(2000),equalTo(true));
  }

  @Test
  void testLeapYear1800NotLeapYear(){
    assertThat(LeapYearRoom14.checkForLeapYear(1800),equalTo(false));
  }

  @Test
  void testLeapYear2020IsLeapYear(){
    assertThat(LeapYearRoom14.checkForLeapYear(2020),equalTo(true));
  }

  @Test
  void testLeapYear100NotLeapYear(){
    assertThat(LeapYearRoom14.checkForLeapYear(2018),equalTo(false));
  }



}
