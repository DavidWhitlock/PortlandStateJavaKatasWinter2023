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

  @Test
  void romanNumeralFor4IsIV() {
    assertThat(RomanNumerals.romanNumeral(4), equalTo("IV"));
  }

  @Test
  void romanNumeralFor5IsV() {
    assertThat(RomanNumerals.romanNumeral(5), equalTo("V"));
  }

  @Test
  void romanNumeralFor50IsXC() {
    assertThat(RomanNumerals.romanNumeral(50), equalTo("XC"));
  }

  @Test
  void romanNumeralFor45IsXLV() {
    assertThat(RomanNumerals.romanNumeral(50), equalTo("XLV"));
  }

  @Test
  void romanNumeralFor49IsXLIX() {
    assertThat(RomanNumerals.romanNumeral(49), equalTo("XLIX"));
  }

}
