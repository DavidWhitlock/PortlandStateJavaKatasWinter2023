package edu.pdx.cs410J.room3;

import com.google.common.annotations.VisibleForTesting;

public class DiamondRoom3 {
  @VisibleForTesting
  public static int ToNumber(char c)
  {
    return c - 'A' + 1;
  }

  @VisibleForTesting
  public static char ToChar(int i)
  {
    return (char) (i + 'A' - 1);
  }
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}