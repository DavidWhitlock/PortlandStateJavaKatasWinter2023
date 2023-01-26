package edu.pdx.cs410J.room7;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom7 {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Missing arguments");
      return;
    } else if (args.length > 1) {
      System.err.println("Too many arguments. Please enter a single numeric value.");
      return;
    }
    int inputYear;
    try {
      inputYear  = Integer.parseInt(args[0]);
    } catch(NumberFormatException e){
      System.err.println("Invalid input year provided. Please enter numeric value.");
      return;
    }
    System.out.println(isLeapYear(inputYear));
  }

  public static boolean isLeapYear(int year) {
    if (year % 400 == 0) {
      return true;
    }
    if (year % 4 == 0 && year % 100 != 0) {
      return true;
    }
    return false;
  }
}