package edu.pdx.cs410J.room8;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom8 {

  @VisibleForTesting
  public static void main(String[] args) {
    boolean res = checkForLeapYear(1000);
    if (res) System.out.println("Leap year!");
    else {
      System.out.println("Not a leap year!");
    }
  }

  static boolean checkForLeapYear(int number) {
    boolean val = false;

    if (number % 400 == 0) {
      val = true;
    }
    if ((number % 100 == 0) && (number % 400 != 0)) {
      val = true;
    }

    return val;
  }
}