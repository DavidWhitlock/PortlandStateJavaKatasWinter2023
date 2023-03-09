package edu.pdx.cs410J.room1;

import com.google.common.annotations.VisibleForTesting;

import java.util.Arrays;
import java.util.Stack;

public class RPNCalculatorRoom1 {

  public int calculateRPN(String expression) {

    //parse the expression
    String []  ops = expression.split(" ");

    Stack <Integer> stack  = new Stack<>();

    for(String op : ops)
    {
      if(op.equals("+")){
        try{
          int first = stack.pop();
        }catch () {

        }
      }
    }

//    System.out.println(Arrays.toString(ops));
    return Integer.parseInt(ops[0]);
  }


  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}