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
    String[] fieldSize = input.split(" ");
    try {
      if (Integer.parseInt(fieldSize[0]) > 0 && Integer.parseInt(fieldSize[1]) > 0 && Integer.parseInt(fieldSize[0]) <= 100 && Integer.parseInt(fieldSize[1]) <= 100) {
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