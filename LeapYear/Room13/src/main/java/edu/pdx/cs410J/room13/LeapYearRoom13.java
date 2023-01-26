package edu.pdx.cs410J.room13;

import com.google.common.annotations.VisibleForTesting;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

  public static int parseYearCheck(String[] args) throws IOException {
    try {
      Date date = new Date("yyyy");
      return parseInt(date.toString());
    } catch (IllegalArgumentException e) {
      throw new IOException("Unable to parse year.");
    }
  }
  @VisibleForTesting
  public static void main(String[] args) {
    try {
      if (args.length < 1)
        throw new IllegalArgumentException("Missing command line arguments");
      System.out.println(LeapYearRoom13.leapYearCheck(parseYearCheck(args)));
    } catch (IOException | IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }


  }
}