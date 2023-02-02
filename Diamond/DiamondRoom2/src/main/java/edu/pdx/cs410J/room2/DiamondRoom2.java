package edu.pdx.cs410J.room2;

import com.google.common.annotations.VisibleForTesting;

public class DiamondRoom2 {

  @VisibleForTesting
  static String createDiamond(char ch){
    if(ch == 'A')
      return "A";
    String pattern = "";

    int internalSpaces = 1;
    // Build the upper half of the diamond
    for(int i = 65; i<=ch; i++) {
      int spaces = ch - i ;
      pattern = addSpaces(pattern, spaces);
      pattern += (char)i;
      if(i != 65) {
        pattern = addSpaces(pattern, internalSpaces);
        pattern += (char)i;
        internalSpaces+=2;
      }
      pattern = addSpaces(pattern, spaces);
      pattern += "\n";
    }
    internalSpaces-=2;

    // Build the lower half of the diamond
    for(int i = ch-1; i>=65; i--) {
      int spaces = ch - i ;
      pattern = addSpaces(pattern, spaces);
      pattern += (char)i;
      if(i != 65) {
        internalSpaces-=2;
        pattern = addSpaces(pattern, internalSpaces);
        pattern += (char)i;
      }
      pattern = addSpaces(pattern, spaces);
      pattern += "\n";
    }
    System.out.println(pattern);
    return pattern;
  }

  private static String addSpaces(String pattern, int spaces) {
    for (int j = 1; j<= spaces; j++) {
      pattern += " ";
    }
    return pattern;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    if(args!= null && args.length == 0) {
      System.err.println("Missing command line arguments");
      return;
    }
    String inputChar = args[0];
    createDiamond(inputChar.charAt(0));
  }
}