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

    if(!ip.contains(" ") || !ip.contains("|") || !ip.contains("_"))
      return false;

    return true;
  }
}