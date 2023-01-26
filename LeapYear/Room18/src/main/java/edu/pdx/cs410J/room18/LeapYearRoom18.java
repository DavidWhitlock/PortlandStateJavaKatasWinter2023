package edu.pdx.cs410J.room18;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom18 {
  public static class LeapYearLogic {
    public boolean yearDivisibleBy400IsALeapYear(int year) {
      return true;
    }

    public static boolean yearDivisibleBy100ButNot400IsALeapYear(int year) {
      return true;
    }

    public static boolean yearDivisibleBy4ButNot100IsALeapYear(int year) {
      return true;
    }

    /**
     * <p>Leap years must be divisible by 4</p>
     * @param year
     * @return
     */
    static boolean LeapYearMustBeDivisibleBy4(int year) {
      return (year % 4 == 0);
    }
  }
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}