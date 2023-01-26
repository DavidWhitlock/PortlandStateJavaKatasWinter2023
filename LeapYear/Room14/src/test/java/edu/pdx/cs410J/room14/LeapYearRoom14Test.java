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
    assertThat(LeapYearRoom14.checkForLeapYear(400),equalTo(false));
  }

  @Test
  void testLeapYear2000IsLeapYear() {
    assertThat(LeapYearRoom14.checkForLeapYear(2000),equalTo(true));
  }




}
