package edu.pdx.cs410J.room1;

import com.google.common.annotations.VisibleForTesting;
import org.checkerframework.checker.units.qual.A;

import java.util.Arrays;
import java.util.Stack;

public class RPNCalculatorRoom1 {

  public int calculateRPN(String expression) {

    //parse the expression
    String []  ops = expression.split(" ");

    Stack <Integer> stack  = new Stack<>();
    int result = 0;

    for(String op : ops) {
      switch(op) {
        case "+":
          result += stack.pop() + stack.pop();
          stack.push(result);
          break;

        case "-":
          result -= stack.pop() - stack.pop();
          stack.push(result);
          break;

        case "/":
          result /= stack.pop() / stack.pop();
          stack.push(result);
          break;

        case "*":
          break;

        default:
          try {
            stack.add(Integer.parseInt(op));
          } catch (NumberFormatException e) {System.err.println(e.getMessage()); break;}

      } // end of switch

    }
    return result;
  }


  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}