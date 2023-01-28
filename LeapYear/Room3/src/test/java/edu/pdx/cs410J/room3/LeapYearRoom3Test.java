package edu.pdx.cs410J.room3;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearRoom3Test
{
/**
 * Validate the year
 */
  @Test
  @Disabled
  void validateYear(){
    int invalidYear = -134;
    int validYear = 2023;

    assertThat(LeapYearRoom3.isValidYear(invalidYear),equalTo(false));
    assertThat(LeapYearRoom3.isValidYear(validYear),equalTo(false));
  }

}