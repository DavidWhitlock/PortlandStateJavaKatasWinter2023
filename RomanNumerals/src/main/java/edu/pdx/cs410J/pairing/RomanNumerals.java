package edu.pdx.cs410J.pairing;

import com.google.common.annotations.VisibleForTesting;

public class RomanNumerals {

  @VisibleForTesting
  public static void main(String[] args) {

    System.err.println("Missing command line arguments");
  }

  public static String romanNumeral(int number) {

    switch(number) {
      case 1: return "I";
      case 2: return "II";
      case 3: return "III";
      case 4: return "IV";
      case 5: return "V";

      default:  return "";
    }

  }
}