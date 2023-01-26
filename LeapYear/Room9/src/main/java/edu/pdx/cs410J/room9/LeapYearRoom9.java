package edu.pdx.cs410J.room9;

import com.google.common.annotations.VisibleForTesting;

/**
 * Acceptance Criteria:
 *
 * All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
 * All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
 * All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
 * All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
 */
public class LeapYearRoom9 {

  public static boolean isLeapYear(int year){
    return true;
  }


  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}