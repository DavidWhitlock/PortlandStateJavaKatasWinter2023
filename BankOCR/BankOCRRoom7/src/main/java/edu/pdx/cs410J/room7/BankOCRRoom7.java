package edu.pdx.cs410J.room7;

import com.google.common.annotations.VisibleForTesting;

public class BankOCRRoom7 {



  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public boolean validateString(String line) throws Exception {
    int stringyness = line.length();
    if (stringyness != 27) {
      throw new Exception("uh oh input was not 27, instead it was: " + stringyness);
    }
    return true;
  }
}