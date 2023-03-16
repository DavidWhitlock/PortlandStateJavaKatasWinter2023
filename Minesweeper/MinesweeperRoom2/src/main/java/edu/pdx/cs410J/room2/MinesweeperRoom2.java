package edu.pdx.cs410J.room2;

import com.google.common.annotations.VisibleForTesting;

public class MinesweeperRoom2 {

  String [] validInput = null;
  int row = -1;
  int column = -1;
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
  public int getValue(int x, int y)
  {
    if (x < 0 || x > column || y < 0 || y > row)
    {
      return 0;
    } else {
      return validInput[y].charAt(x) == '*' ? 1 : 0;
    }
  }
  public void printSolved() throws IllegalArgumentException
  {
    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < column; j++)
      {
        char c = validInput[i].charAt(j);
        if (c == '*')
        {
          System.out.print('*');
        }
        if (c == '.')
        {
          System.out.print("" + getValue(j,i) + getValue(j,i) + getValue(j,i)+
                                   getValue(j,i)+                getValue(j,i)+
                                   getValue(j,i)+ getValue(j,i)+ getValue(j,i));
        }
      }
    }
  }
  public boolean validateInput(String input) {
    boolean val = true;
    String[] inputArray = input.split("\n");
    String linefirst = inputArray[0];
    String[] fieldSize = linefirst.split(" ");
    try {
      row = Integer.parseInt(fieldSize[0]);
      column = Integer.parseInt(fieldSize[1]);
      if (!(row > 0 && column > 0 && row <= 100 && column <= 100))
        return false;
      if (inputArray.length-1 != row)
          return false;
      if (inputArray[1].length() != column)
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