package edu.pdx.cs410J.room8;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom8 {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Missing command-line argument for leap year.");
    }
    else {
      int num = Integer.parseInt(args[0]);
      if (checkForLeapYear(num)) {
        System.out.println("Leap year!");
      } else {
        System.out.println("Not a leap year!");
      }
    }

  }

  static boolean checkForLeapYear(int number) {
    boolean val = false;

    if (number % 400 == 0) {
      val = true;
    }
    else if ((number % 4 == 0) && (number % 100 != 0)) {
      val = true;
    }

    return val;
  }
}