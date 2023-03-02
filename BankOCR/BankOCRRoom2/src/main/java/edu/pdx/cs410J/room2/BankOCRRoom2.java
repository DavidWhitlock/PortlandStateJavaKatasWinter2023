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

    String[] eachLineArray = ip.split("\n");
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
}