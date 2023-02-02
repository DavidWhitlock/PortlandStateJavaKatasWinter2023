package edu.pdx.cs410J.pairing;

import org.junit.jupiter.api.Disabled;
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
  void romanNumeralFor6IsVI() {
    assertThat(RomanNumerals.romanNumeral(6), equalTo("VI"));
  }

  void romanNumeralFor7IsVII() {
    assertThat(RomanNumerals.romanNumeral(7), equalTo("VII"));
  }

  void romanNumeralFor8IsVIII() {
    assertThat(RomanNumerals.romanNumeral(8), equalTo("VIII"));
  }

  @Test
  @Disabled
  void romanNumeralFor50IsXC() {
    assertThat(RomanNumerals.romanNumeral(50), equalTo("XC"));
  }

  @Test
  @Disabled
  void romanNumeralFor45IsXLV() {
    assertThat(RomanNumerals.romanNumeral(50), equalTo("XLV"));
  }

  @Test
  @Disabled
  void romanNumeralFor49IsXLIX() {
    assertThat(RomanNumerals.romanNumeral(49), equalTo("XLIX"));
  }

}
