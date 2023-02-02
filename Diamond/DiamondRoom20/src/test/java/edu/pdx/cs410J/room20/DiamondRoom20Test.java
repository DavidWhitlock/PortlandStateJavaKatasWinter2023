package edu.pdx.cs410J.room20;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.pdx.cs410J.InvokeMainTest;

public class DiamondRoom20Test
{

  @Test
  void canInstantiateKataClass() {
    new DiamondRoom20();
  }

  @Test
  void diamondWithA() {
    DiamondRoom20  diamond = new DiamondRoom20();
    assertEquals("A", diamond.drawDiamond('A'));
  }

  @Test
  void diamondWithB(){
    DiamondRoom20 diamondB = new DiamondRoom20();
    assertEquals(" A\nB B\n A", diamondB.drawDiamond('B'));
  }
}
