package edu.pdx.cs410J.room7;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MinesweeperRoom7Test {

  @Test
  void canInstantiateKataClass() {
    new MinesweeperRoom7();
    char[][] testMatrix = MinesweeperRoom7.initializeBoard(1, 1);

    assertThat(testMatrix.length, equalTo(1));
    assertThat(testMatrix[0].length, equalTo(1));

  }

  @Test
  void canInitializeBoardWithString() {
    new MinesweeperRoom7();
    char[][] testMatrix = MinesweeperRoom7.initializeBoard("1 1");

    assertThat(testMatrix.length, equalTo(1));
    assertThat(testMatrix[0].length, equalTo(1));

  }

  @Test
  void oneByOneBoardWithMine() {
    String[] board = {
      "1 1",
      "*"
    };

    char[][] solution = MinesweeperRoom7.initializeBoard(board);
    assertThat(solution[0][0], equalTo('*'));
  }

  @Test
  void canInitializeStateOfTheGame() {
    /*
 4 4
*...
....
.*..
....
3 5
**...
.....
.*...
0 0
     */

  }

}
