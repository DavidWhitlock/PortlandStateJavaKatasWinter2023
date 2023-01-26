package edu.pdx.cs410J.room6;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom6 {

  @VisibleForTesting
  public static void main(String[] args) {

    System.err.println("Missing command line arguments");

//    System.out.println(isLeapYear(100));
  }

  public static boolean isLeapYear(int year){
//    if (year % 400 == 0) {
//      return true;
//    }
    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
      return true;
    }


    return false;
  }

}