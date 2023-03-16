package edu.pdx.cs410J.room7;

import com.google.common.annotations.VisibleForTesting;

public class MinesweeperRoom7 {

  @VisibleForTesting
  public static void main(String[] args) {

  }

/*
    Two initializeBoard() functions exist, where:
      a.) initializeBoard(String mineField) will...
        i.) Processes: -> mineField (column & row-number), e.g. "3 3", Returns:
      b.) initializeBoard(int i1, int i2) will...
        ii.) Processes: -> , Returns: ->
 */
  public static char[][] initializeBoard(String... mineField) {
    String[] coordinate = mineField[0].split(" ");
    int row = Integer.parseInt(coordinate[0]);
    int column = Integer.parseInt(coordinate[1]);

    // char[][] metal_detector =

    return initializeBoard(row, column);
  }
  public static char[][] initializeBoard(int i1, int i2) {
    char[][] twoDBoard = new char[i1][i2];
    twoDBoard[0][0] = '*';
    return twoDBoard;
  }
}