package edu.pdx.cs410J.room13;

import com.google.common.annotations.VisibleForTesting;

public class DiamondRoom13 {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static String diamond(char middleChar) {
    StringBuilder sb = new StringBuilder();
    for (char c = 'A'; c <= middleChar; c++) {
      row(middleChar, sb, c);
    }

    for (char c = (char) (middleChar - 1); c >= 'A'; c--) {
      row(middleChar, sb, c);
    }

    return sb.toString();
  }

  private static void row(char middleChar, StringBuilder sb, char c) {
    int indent = middleChar - c;
    sb.append(" ".repeat(indent));

    int space = c - 'A';
    if (space > 0) {
      sb.append(c);
      sb.append(" ".repeat((2 * space) - 1));
    }

    sb.append(c);
    sb.append('\n');
  }

}