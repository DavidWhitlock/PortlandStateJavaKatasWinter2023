package edu.pdx.cs410J.room13;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom13 {
  public static boolean leapYearCheck(int year) {
    boolean rval = false;
    if (year % 400 == 0) {
      rval = true;
    } else if (year % 100 == 0) {
      rval = false;
    } else if (year % 4 == 0) {
      rval = true;
    }
    return rval;
  }
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}