package edu.pdx.cs410J.room7;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RPNCalculatorRoom7Test
{

  @Test
  void canInstantiateKataClass() {
    new RPNCalculatorRoom7();
  }

  @Test
  void testOutputTwoOperatorDivision() {
    String[] args = new String[]{"4","2","/"};

  }

  @Test
  void testCalculateRPNSquareRoot(){
    int[] numbers = {6};
    RPNCalculatorRoom7 room = new RPNCalculatorRoom7();
    assertThat(room.calculateOperation(numbers, "SQRT"), equalTo(2.449489742783178));
  }

  @Test
  void testCalculateRPNMAX(){
    int[] numbers = {6, 2, 1, 9, 13, 4};
    RPNCalculatorRoom7 room = new RPNCalculatorRoom7();
    assertThat(room.calculateOperation(numbers, "MAX"), equalTo(13.0));
  }

  @Test
  void testCalculateRPNDivide(){
    int[] numbers = {11, 2};
    RPNCalculatorRoom7 room = new RPNCalculatorRoom7();
    assertThat(room.calculateOperation(numbers, "/"), equalTo(5.5));
  }

  @Test
  void testCalculateRPNMultiply(){
    int[] numbers = {11, 2};
    RPNCalculatorRoom7 room = new RPNCalculatorRoom7();
    assertThat(room.calculateOperation(numbers, "*"), equalTo(22.0));
  }

  @Test
  void testCalculateRPNMinus(){
    int[] numbers = {11, 2};
    RPNCalculatorRoom7 room = new RPNCalculatorRoom7();
    assertThat(room.calculateOperation(numbers, "-"), equalTo(9.0));
  }

  @Test
  void testCalculateRPNPlus(){
    int[] numbers = {11, 2};
    RPNCalculatorRoom7 room = new RPNCalculatorRoom7();
    assertThat(room.calculateOperation(numbers, "+"), equalTo(13.0));
  }
}
