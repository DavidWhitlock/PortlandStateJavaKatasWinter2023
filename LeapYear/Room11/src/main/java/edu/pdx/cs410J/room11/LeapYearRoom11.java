package edu.pdx.cs410J.room11;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom11 {

  @VisibleForTesting
  public static boolean isYearALeapYear(int year) {
    if (year % 400 == 0) {
      return true;
    }
    else if(year % 4 == 0 && (year % 100) != 0) {
      return true;
    }
    return false;
  }
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}