package edu.pdx.cs410J.room2;

import com.google.common.annotations.VisibleForTesting;

public class DiamondRoom2 {

  @VisibleForTesting
  static String createDiamond(char ch){
    if(ch == 'A')
      return "A";
    String pattern = "";

    int spaces = ch - 'A' ; //For B, it will be 1
    //Line 1
    for(int i=1; i<=spaces; i++){
      pattern += " ";
    }
    pattern += "A";
    for(int i=1; i<=spaces; i++){
      pattern += " ";
    }
    pattern += "\n"; //marks the end of line

    //Line 2
    pattern += ch;
    for(int i=1; i<=spaces+1; i++){
      pattern += " ";
    }
    pattern += ch;
    pattern += "\n"; //marks the end of line

    //Line 3
    for(int i=1; i<=spaces; i++){
      pattern += " ";
    }
    pattern += "A";
    for(int i=1; i<=spaces; i++){
      pattern += " ";
    }


    return pattern;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}