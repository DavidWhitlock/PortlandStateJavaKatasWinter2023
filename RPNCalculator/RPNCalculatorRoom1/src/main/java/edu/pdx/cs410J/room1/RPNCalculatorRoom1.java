package edu.pdx.cs410J.room1;

import com.google.common.annotations.VisibleForTesting;
import org.checkerframework.checker.units.qual.A;

import java.util.Arrays;
import java.util.Stack;

public class RPNCalculatorRoom1 {

  public int calculateRPN(String expression) {

    //parse the expression
    String[] ops = expression.split(" ");

    Stack<Integer> stack = new Stack<>();
    int result = 0;
    int first;
    int second;
    for (String op : ops) {
      switch (op) {
        case "+":
          second = stack.pop();
          first = stack.pop();
          result = first + second;
          stack.push(result);
          break;

        case "-":
          second = stack.pop();
          first = stack.pop();
          result = first - second;
          stack.push(result);
          break;

        case "/":
          second = stack.pop();
          first = stack.pop();
          result = first / second;
          stack.push(result);
          break;

        case "*":
          second = stack.pop();
          first = stack.pop();
          result = first * second;
          stack.push(result);
          break;
        case "SQRT":
          first = stack.pop();
          result = (int) Math.sqrt(first);
          stack.push(result);
          break;
        case "MAX":
          result = stack.pop();
          while (!stack.empty()) {
            if (result < stack.peek())
              result = stack.pop();
            else
              stack.pop();
          }
          stack.push(result);
          break;
        default:
          try {
            stack.add(Integer.parseInt(op));
          } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            break;
          }

      } // end of switch

    }
    return result;
  }


  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}