package edu.pdx.cs410J.room1;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom1 {
  public static boolean isLeapYear(int year){
    if(year % 4 == 0 && year % 100 != 0) {
      return true;
    }

    return false;
  }
  @VisibleForTesting
  public static void main(String[] args) {
    // System.err.println("Missing command line arguments");
  }
}