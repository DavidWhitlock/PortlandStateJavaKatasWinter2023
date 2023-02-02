package edu.pdx.cs410J.room2;

import com.google.common.annotations.VisibleForTesting;

public class DiamondRoom2 {

  @VisibleForTesting
  static String createDiamond(char ch){
    if(ch == 'A')
      return "A";
    String pattern = "";


    for(int i = 65; i<=ch; i++) {
      int spaces = ch - i ;
      for (int j = 1; j<= spaces; j++) {
        pattern += " ";
      }
      pattern += (char)i;
      if(i != 65) {
        for (int j = 1; j<= spaces+1; j++) {
          pattern += " ";
        }
        pattern += (char)i;
      }
      for (int j = 1; j<= spaces; j++) {
        pattern += " ";
      }
      pattern += "\n";
    }
    for(int i = ch-1; i>=65; i--) {
      int spaces = ch - i ;
      for (int j = 1; j<= spaces; j++) {
        pattern += " ";
      }
      pattern += (char)i;
      if(i != 65) {
        for (int j = 1; j<= spaces+1; j++) {
          pattern += " ";
        }
        pattern += (char)i;
      }
      for (int j = 1; j<= spaces; j++) {
        pattern += " ";
      }
      pattern += "\n";
    }
    System.out.println(pattern);
    return pattern;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}