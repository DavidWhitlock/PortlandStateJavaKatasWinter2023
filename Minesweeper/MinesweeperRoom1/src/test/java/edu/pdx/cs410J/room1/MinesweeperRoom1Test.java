package edu.pdx.cs410J.room1;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class MinesweeperRoom1Test {


  @Test
  void createsMatrixCorrectly() {
    int m = 4, n = 3;
    MinesweeperRoom1 game = new MinesweeperRoom1(m, n);
    Character[][] matrix = game.getDotMatrix();
    MatcherAssert.assertThat(matrix[0][0], equalTo('.'));
  }


  @Test
  void canGetInputFromCommand() {
    int m = 6, n = 8;
    MinesweeperRoom1 game = new MinesweeperRoom1(m, n);
    game.getMatrix();
    game.play();
    game.getMatrix();
  }
}