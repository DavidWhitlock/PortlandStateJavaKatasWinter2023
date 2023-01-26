package edu.pdx.cs410J.room4;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom4 {

  public static final String leapYear = "LEAP YEAR";
  public static final String notLeapYear = "NOT LEAP YEAR";
  public static String LeapYearRoom4Input(int Year){
    String result = null;
    if ((Year % 400) != 0 && (Year % 100) == 0){ // divisible by 100, but not 400 is NOT leap year
      result = notLeapYear;
    }
    else if((Year % 400) == 0){ // all years divisible by 400 ARE leap year
      result = leapYear;
    }
    else if ((Year % 4) == 0 && (Year % 100) != 0) { // divisible by 4 but not 100 ARE leap year
      result = leapYear;
    }
    else if ((Year % 4) != 0){ //not divisible by 4 are NOT leap year
      result = notLeapYear;
    }
    return result;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}