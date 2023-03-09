package edu.pdx.cs410J.room1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RPNCalculatorRoom1Test
{

  @Test
  void canInstantiateKataClass() {
    new RPNCalculatorRoom1();
  }

  @Test
  void canAddTwoNumbers() {
    String args = "2 4 +";
    RPNCalculatorRoom1 rpn = new RPNCalculatorRoom1();
    assertThat(rpn.calculateRPN(args), equalTo(6));
  }

}
