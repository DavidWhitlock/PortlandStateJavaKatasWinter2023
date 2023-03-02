package edu.pdx.cs410J.room7;

import com.google.common.annotations.VisibleForTesting;

public class BankOCRRoom7 {
  final String ZERO = " _ | ||_|";
  final String ONE = "     |  |";
  final String TWO = " _  _||_ ";
  final String THREE = " _  _| _|";
  final String FOUR = "   |_|  |";
  final String FIVE = " _ |_  _|";
  final String SIX = " _ |_ |_|";
  final String SEVEN = " _   |  |";
  final String EIGHT = " _ |_||_|";
  final String NINE = " _ |_| _|";


  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public int validateString(String line) throws Exception {
    int stringyness = line.length();

    if (stringyness != 27)
    {
      throw new Exception("uh oh input was not 27, instead it was: " + stringyness);
    }

    return stringyness;
  }


}