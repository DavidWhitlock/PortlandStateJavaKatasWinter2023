package edu.pdx.cs410J.pairing;

import com.google.common.annotations.VisibleForTesting;

public class FizzBuzz {

  static final String FIZZ = "Fizz";
  static final String BUZZ = "Buzz";
  static final String FIZZBUZZ = "FizzBuzz";

  public static String fizzBuzz(int number) {
    if (number % 15 == 0) {
      return FIZZBUZZ;
    }

    if (number % 3 == 0) {
      return FIZZ;
    }

    if (number % 5 == 0) {
      return BUZZ;
    }

    return String.valueOf(number);
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}