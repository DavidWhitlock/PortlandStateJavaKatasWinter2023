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

  public static String returnDiamond(char key) {
    int height = ToNumber(key);
    StringBuilder builder = new StringBuilder();
    for(int i = 1; i <= height; i++) {
      for (int j = 0; j < (height - i); j++) {
        builder.append(" ");
      }
      builder.append(ToChar(i));
      if (i!= 1) {
        for (int j = 0; j < 2*(i - 1); j++) {
          builder.append(" ");
        }
        builder.append(ToChar(i));
      }
        builder.append("\n");
    }

    for(int i = height - 1; i > 0; i--) {
      for (int j = 0; j < (height - i); j++) {
        builder.append(" ");
      }
      builder.append(ToChar(i));
      if (i!= 1) {
        for (int j = 0; j < 2*(i - 1); j++) {
          builder.append(" ");
        }
        builder.append(ToChar(i));
      }
      if (height != 1){
        builder.append("\n");
      }
    }
    return builder.toString();
  }
}