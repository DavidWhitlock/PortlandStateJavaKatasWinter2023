package edu.pdx.cs410J.room19;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom19 {
  static final String leapYear = " is a Leap Year";
  static final String notLeapYear = " is not a Leap Year";
  @VisibleForTesting
  public static void main(String[] args) {
    if(args.length ==0) System.err.println("Missing command line arguments");
    for(String arg: args){
      isLeapYear(arg);
    }
  }

  static boolean isLeapYear(String year){
    int yr = Integer.parseInt(year);
    if(yr%400==0 || (yr%4==0&& yr%100!=0)){
      System.out.println(year + leapYear);
      return true;
    }
    System.out.println(year + notLeapYear);
    return false;
  }

}