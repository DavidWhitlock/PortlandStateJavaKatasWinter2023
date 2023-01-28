package edu.pdx.cs410J.room3;

import com.google.common.annotations.VisibleForTesting;

public class LeapYearRoom3 {
/**
if NUMBER is divisible by 4, 100, 400 = LEAP YEAR (True)
if NUMBER is divisible by 4, 400 &amp;&amp; NOT 100 = LEAP YEAR
if NUMBER is divisible by 4 &amp;&amp; NOT 100, NOT 400 = LEAP YEAR

else FALSE
 **/
  public static boolean isLeapYear(int year){
    boolean div4 = year % 4 == 0;
    boolean div400 = year % 400 == 0;
    boolean div100 = year % 100 == 0;

    if(div4 && div400 && div100)
      return true;
    if(div4 && div400 && !div100)
      return true;
    if(div4 && !div100 && !div400)
      return true;

    return false;
  }
  public static boolean isValidYear(int yearInput){
    if(yearInput > 0){
      return true;
    }
    return false;
  }
  @VisibleForTesting
  public static void main(String[] args) {
    if(args.length < 1) {
      System.err.println("Invalid Input!");
    } else {
    int arg = Integer.parseInt(args[0]);
    if(isValidYear(arg)){
      System.out.println(args[0] + (isLeapYear(arg) ? " is" : " is not") + " a leap year: ");
    } else
      System.err.println("Invalid year!");
    }

  }
}
