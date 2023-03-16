package edu.pdx.cs410J.room2;

import org.junit.jupiter.api.Test;

public class MinesweeperRoom2Test
{

  @Test
  void canInstantiateKataClass() {
    new MinesweeperRoom2();
  }

  @Test
  public void validateFirstLineOfTheInput() {
    MinesweeperRoom2 mw = new MinesweeperRoom2();
    String inputArray = "4 4\n" +
            "*...\n" +
            "....\n" +
            ".*..\n" +
            "....";

    // assertTrue(mw.validateInput());

  }

}
