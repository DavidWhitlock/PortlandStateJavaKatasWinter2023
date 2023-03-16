package edu.pdx.cs410J.room7;

import com.google.common.annotations.VisibleForTesting;

import java.util.Arrays;

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

    String[] gameBoard = Arrays.copyOfRange(mineField, 1, mineField.length);
    return initializeBoard(row, column, gameBoard);
  }
  public static char[][] initializeBoard(int i1, int i2, String... gameBoard) {
    char[][] twoDBoard = new char[i1][i2];
    char space = gameBoard[0].charAt(0);
    twoDBoard[0][0] = space;
    return twoDBoard;
  }
}