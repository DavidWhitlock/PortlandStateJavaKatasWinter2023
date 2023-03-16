package edu.pdx.cs410J.room2;

import com.google.common.annotations.VisibleForTesting;

public class MinesweeperRoom2 {

  String [] validInput = null;
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
      if (!(firstInt > 0 && secondInt > 0 && firstInt <= 100 && secondInt <= 100))
        return false;
      if (inputArray.length-1 != firstInt)
          return false;
      if (inputArray[1].length() != secondInt)
        return false;

      validInput = new String[inputArray.length-1];
      System.arraycopy(inputArray, 1, validInput, 0, inputArray.length - 1);

      } catch (Exception e) {
      System.err.println(e.getMessage());
      return false;
    }
  return true;
  }
}