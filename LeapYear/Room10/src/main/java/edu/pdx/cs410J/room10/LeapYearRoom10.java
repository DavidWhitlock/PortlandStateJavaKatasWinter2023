package edu.pdx.cs410J.room10;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom10 {

  public static boolean isLeapYear(int year) {
    if(year%400 == 0){
      return true;
    }
    else if(year%4 == 0 && year%100 != 0){
      return true;
    }
    return false;
  }


  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
    }

    int year;

    try {
      year = Integer.parseInt(args[0]);
    }
    catch (Exception e) {
      System.err.println("Invalid int");
      return;
    }

    if (year < 0) {
      System.err.println("Please provide a year greater than 0");
      return;
    }

    if (isLeapYear(year)) {
      System.out.println(year + " is a leap year");
    }
    else {
      System.out.println(year + " is NOT a leap year");
    }
  }
}