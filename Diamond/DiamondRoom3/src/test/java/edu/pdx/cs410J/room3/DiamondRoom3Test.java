package edu.pdx.cs410J.room3;

import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DiamondRoom3Test
{

 // @Test
  //void canInstantiateKataClass() {
    //new DiamondRoom3();
 // }
  @Test
  void testToNumberC()
  {
    assertThat(DiamondRoom3.ToNumber('C'), equalTo(3));
  }
  @Test
  void testToNumberF()
  {
    assertThat(DiamondRoom3.ToNumber('F'), equalTo(6));
  }
  @Test
  void testToNumberG()
  {
    assertThat(DiamondRoom3.ToNumber('G'), equalTo(7));
  }
  @Test
  void testToNumberA()
  {
    assertThat(DiamondRoom3.ToNumber('A'), equalTo(1));
  }
  @Test
  void testToChar3()
  {
    assertThat(DiamondRoom3.ToChar(3), equalTo('C'));
  }
  @Test
  void testToChar7()
  {
    assertThat(DiamondRoom3.ToChar(7), equalTo('G'));
  }
  @Test
  void testToChar6()
  {
    assertThat(DiamondRoom3.ToChar(6), equalTo('F'));
  }
  @Test
  void testToChar1()
  {
    assertThat(DiamondRoom3.ToChar(1), equalTo('A'));
  }
}
