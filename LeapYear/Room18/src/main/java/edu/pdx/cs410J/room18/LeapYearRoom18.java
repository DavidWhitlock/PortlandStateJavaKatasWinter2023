package edu.pdx.cs410J.room18;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom18 {
  public static class LeapYearLogic {

    /**
     * If year is divisible by 400, then it is a Leap Year
     * @param year
     * @return
     */
    static boolean yearDivisibleBy400IsALeapYear(int year) {
      return (year % 400 == 0);
    }

    /**
     * If year is divisible by 100, but not 400 then it is a Leap Year
     * @param year
     * @return
     */
    public static boolean yearDivisibleBy100ButNot400IsNotLeapYear(int year) {
      return (year % 100 == 0 && year % 400 != 0);
    }

    /**
     * <p>If years is divisible by 4, but not 100 then it is a Leap Year</p>
     * @param year
     * @return Return true if year is a Leap Year, returns false if year is not a Leap Year
     */
    static boolean yearDivisibleBy4ButNot100IsALeapYear(int year) {
      return (year % 4 == 0 && year % 100 != 0);
    }

    /**
     * <p>Leap years must be divisible by 4</p>
     * @param year
     * @return Return true if year is a Leap Year, returns false if year is not a Leap Year
     */
    static boolean LeapYearMustBeDivisibleBy4(int year) {
      return (year % 4 == 0);
    }
  }
  @VisibleForTesting
  public static void main(String[] args) {
    int year=0;
    if(args.length == 0){
      System.err.println("Missing command line arguments");
    }

    //catch if input is not a valid number
    try{
      year = Integer.parseInt(args[0]);
    } catch (Exception err) {
      System.err.println("ERROR: Invalid argument input. Must be a valid integer.");
      return;
    }

    if(LeapYearLogic.yearDivisibleBy400IsALeapYear(year)
            || LeapYearLogic.yearDivisibleBy4ButNot100IsALeapYear(year)){
              System.out.println("Input year is a Leap Year, huzzah!");
    }
    else{
      System.out.println("Not a Leap Year. Sorry bud. *sad trombone sounds*");
    }
  }
}