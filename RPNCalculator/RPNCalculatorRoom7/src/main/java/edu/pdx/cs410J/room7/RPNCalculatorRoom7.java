package edu.pdx.cs410J.room7;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class RPNCalculatorRoom7 {
  public double calculateOperation(int[] operands, String operator) {
    if(operator.equals("SQRT")) {
      return Math.sqrt((double) operands[0]);
    }
    else if(operator.equals("MAX")) {
      return (double) Arrays.stream(operands).max().getAsInt();
    }
    else if(operator.equals("/")) {
      return (double) operands[0]/operands[1];
    }
    else if(operator.equals("*")) {
      return (double) operands[0]*operands[1];
    }
    else if(operator.equals("-")) {
      return (double) operands[0]-operands[1];
    }
    else if(operator.equals("+")) {
      return (double) operands[0]+operands[1];
    }
    return 10.0;
  }
  public void calculateRPN(String[] args) {
    Collection<Object> argCollection = new ArrayList<>();
    for(String arg: args) {
      try {
        Integer number = Integer.parseInt(arg);
        argCollection.add(number);
      } catch(NumberFormatException err) {
        //its an operand
        argCollection.add(arg);
      }
    }
  }
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}