package edu.pdx.cs410J.room5;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom5 {

  static boolean isLeapYear(int year)
  {
    if(year % 400 == 0)
      return true;

    if(year % 100 == 0 && year % 400 !=0)
      return false;

    if(year %4 ==0 && year%100 !=0)
      return true;

    return false;
  }



  @VisibleForTesting
  public static void main(String[] args) {
    int year = Integer.parseInt(args[0]);
    if(year < 0)
      System.err.println("Invalid argument");
  }
}