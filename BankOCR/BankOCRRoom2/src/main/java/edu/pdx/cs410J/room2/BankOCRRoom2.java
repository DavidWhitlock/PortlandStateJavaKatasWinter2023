package edu.pdx.cs410J.room2;

import com.google.common.annotations.VisibleForTesting;

public class BankOCRRoom2 {

  @VisibleForTesting
  public static void main(String[] args) {

    System.err.println("Missing command line arguments");
  }

  public boolean validate(String ip) {
    if(ip==null || ip.isEmpty())
      return false;

    for(int i = 0; i < ip.length(); ++i) {
      if((ip.charAt(i) != ' ') && (ip.charAt(i) != '|') && (ip.charAt(i) != '_') && (ip.charAt(i) != '\n'))
        return false;
    }

    String[] eachLineArray = splitInputString(ip);
    if (eachLineArray.length != 3) {
      return false;
    }

    for (String eachLine: eachLineArray) {
      if (eachLine.length() != 27) {
        return false;
      }

    }

    return true;
  }

  public int parse(String ip) {
    String[] eachLineArray = splitInputString(ip);

    StringBuilder sb = new StringBuilder();

    for (String eachLine: eachLineArray) {
      for (int i = 0; i < 3; i++)
        sb.append(eachLine.charAt(i));
    }
    switch(sb.toString()){
      case " _ | ||_|":
        return 0;
      case "     |  |":
        return 1;
      case " _  _||_ ":
        return 2;
      default:
        return -1;
    }
  }

  public String[] splitInputString(String ip) {
    String[] eachLineArray = ip.split("\n");
    return eachLineArray;
  }
}