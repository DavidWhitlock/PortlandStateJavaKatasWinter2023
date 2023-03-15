package edu.pdx.cs410J.room7;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

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
    ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(6d));
    RPNCalculatorRoom7 room = new RPNCalculatorRoom7();
    assertThat(room.calculateOperation(numbers, "SQRT"), equalTo(2.449489742783178));
  }

  @Test
  void testCalculateRPNMAX(){
    ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(6d, 2d, 1d, 9d, 13d, 4d));
    RPNCalculatorRoom7 room = new RPNCalculatorRoom7();
    assertThat(room.calculateOperation(numbers, "MAX"), equalTo(13.0));
  }

  @Test
  void testCalculateRPNDivide(){
    ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(11d, 2d));
    RPNCalculatorRoom7 room = new RPNCalculatorRoom7();
    assertThat(room.calculateOperation(numbers, "/"), equalTo(5.5));
  }

  @Test
  void testCalculateRPNMultiply(){
    ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(11d, 2d));
    RPNCalculatorRoom7 room = new RPNCalculatorRoom7();
    assertThat(room.calculateOperation(numbers, "*"), equalTo(22.0));
  }

  @Test
  void testCalculateRPNMinus(){
    ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(11d, 2d));
    RPNCalculatorRoom7 room = new RPNCalculatorRoom7();
    assertThat(room.calculateOperation(numbers, "-"), equalTo(9.0));
  }

  @Test
  void testCalculateRPNPlus(){
    ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(11d, 2d));
    RPNCalculatorRoom7 room = new RPNCalculatorRoom7();
    assertThat(room.calculateOperation(numbers, "+"), equalTo(13.0));
  }

  @Disabled
  @Test
  void testCommandLineArguments(){
    String[] args = {"4", "2", "/", "3", "+", "SQRT", "5", "+"};
    RPNCalculatorRoom7 room = new RPNCalculatorRoom7();
    assertThat(room.calculateRPN(args), equalTo(5d));
  }
}