package edu.pdx.cs410J.room1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RPNCalculatorRoom1Test {

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

  @Test
  void canAddTwoNumbersAndThenSubtractAThirdNumber() {
    String args = "4 2 + 3 - ";
    RPNCalculatorRoom1 rpn = new RPNCalculatorRoom1();
    assertThat(rpn.calculateRPN(args), equalTo(3));
  }

  @Test
  void CodingDojoExample3() {
    String args = "3 5 8 * 7 + *";
    RPNCalculatorRoom1 rpn = new RPNCalculatorRoom1();
    assertThat(rpn.calculateRPN(args), equalTo(141));
  }

  @Test
  void CodingDojoExample1() {
    String args = "20 5 /";
    RPNCalculatorRoom1 rpn = new RPNCalculatorRoom1();
    assertThat(rpn.calculateRPN(args), equalTo(4));
  }

  @Test
  void Sqrt() {
    String args = "9 SQRT";
    RPNCalculatorRoom1 rpn = new RPNCalculatorRoom1();
    assertThat(rpn.calculateRPN(args), equalTo(3));
  }

  @Test
  void Max() {
    String args = "5 3 4 2 9 1 MAX";
    RPNCalculatorRoom1 rpn = new RPNCalculatorRoom1();
    assertThat(rpn.calculateRPN(args), equalTo(9));
  }

  @Test
  void MaxPlus() {
    String args = "4 5 MAX 1 +";
    RPNCalculatorRoom1 rpn = new RPNCalculatorRoom1();
    assertThat(rpn.calculateRPN(args), equalTo(6));
  }

}
