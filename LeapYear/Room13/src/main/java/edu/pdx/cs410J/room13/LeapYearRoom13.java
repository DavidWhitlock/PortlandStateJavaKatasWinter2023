package edu.pdx.cs410J.room13;

import com.google.common.annotations.VisibleForTesting;

import java.io.IOException;

import static java.lang.Integer.parseInt;

public class LeapYearRoom13 {
  public static boolean leapYearCheck(int year) {
    boolean rval = false;
    if (year % 400 == 0) {
      rval = true;
    } else if (year % 100 == 0) {
      rval = false;
    } else if (year % 4 == 0) {
      rval = true;
    }
    return rval;
  }

  private static int parseYearCheck(String[] args) throws IOException {
    try {
       return parseInt(args[0]);
    } catch (NumberFormatException e) {
      throw new IOException("Unable to parse year.  Not an integer.");
    }
  }
  @VisibleForTesting
  public static void main(String[] args) {

    try {
      System.out.println(LeapYearRoom13.leapYearCheck(parseYearCheck(args)));
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }


  }
}