package edu.pdx.cs410J.pairing;

import com.google.common.annotations.VisibleForTesting;

public class RomanNumerals {

  @VisibleForTesting
  public static void main(String[] args) {

    System.err.println("Missing command line arguments");
  }

  public static String romanNumeral(int number) {

    StringBuilder sb = new StringBuilder();

    romanNumeral(sb, number);

    return sb.toString();
  }

  private static void romanNumeral(StringBuilder sb, int number) {

    if (number == 40) {
      sb.append("XL");

    } else if (number >= 10) {
      sb.append("X");
      romanNumeral(sb, number - 10);

    } else if (number == 9) {
      sb.append("IX");

    } else if (number >= 5) {
      sb.append("V");
      romanNumeral(sb, number - 5);

    } else if (number == 4) {
      sb.append("IV");

    } else if (number >= 1) {
      sb.append("I");
      romanNumeral(sb, number - 1);
    }

  }
}