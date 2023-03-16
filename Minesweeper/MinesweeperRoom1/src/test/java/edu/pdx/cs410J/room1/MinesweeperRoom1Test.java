package edu.pdx.cs410J.room1;

import org.junit.jupiter.api.Test;

public class MinesweeperRoom1Test {


  @Test
  void createsMatrixCorrectly(){
    int m = 4, n =3;
    MinesweeperRoom1 game = new MinesweeperRoom1(m, n);
    game.getMatrix();


  }


/*
  @Test
  void canGetInputFromCommand
 */
}