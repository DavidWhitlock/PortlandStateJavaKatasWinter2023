package edu.pdx.cs410J.pairing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RomanNumeralsTest
{

  @Test
  void romanNumberOneisI() {
    String result = RomanNumerals.romanNumeral(1);
    assertThat(result, equalTo("I"));
  }



}
