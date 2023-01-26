package edu.pdx.cs410J.room14;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom14 {

  public static boolean checkForLeapYear(int year) {
    if(year % 4 != 0) {
      return false;
    }
    if ((year % 100 == 0) && (year % 400 != 0)) {
      return false;
    }
    if(year %400==0){
      return true;
    }
    if((year % 4 == 0) &&(year % 100 != 0)){
      return true;
    }
    return false;
}

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}