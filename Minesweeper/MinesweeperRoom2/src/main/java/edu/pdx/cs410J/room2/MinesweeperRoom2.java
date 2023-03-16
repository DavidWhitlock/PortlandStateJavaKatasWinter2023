package edu.pdx.cs410J.room2;

import com.google.common.annotations.VisibleForTesting;

public class MinesweeperRoom2 {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public boolean validateInput(String input) {
    boolean val = true;
    String[] inputArray = input.split("\n");
    String linefirst = inputArray[0];
    String[] fieldSize = linefirst.split(" ");
    try {
      int firstInt = Integer.parseInt(fieldSize[0]);
      int secondInt = Integer.parseInt(fieldSize[1]);
      if (firstInt > 0 && secondInt > 0 && firstInt <= 100 && secondInt <= 100) {
        if (inputArray.length-1 != firstInt) {
          return false;
        }
        if (inputArray[1].length() != secondInt) {
          return false;
        }
        for(int i=1;i< inputArray.length; i++){

        }
        return true;
      } else {
        return false;
      }
    } catch (Exception e) {
      System.err.println(e.getMessage());
      return false;
    }

  }
}