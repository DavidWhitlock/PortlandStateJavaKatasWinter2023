package edu.pdx.cs410J.pairing;

import com.google.common.annotations.VisibleForTesting;

public class FizzBuzz {

  public static String fizzBuzz(int number){
    if(number % 3 == 0)
      return "fizz";
    return "buzz";
  }
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}