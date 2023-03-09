package edu.pdx.cs410J.room7;

import com.google.common.annotations.VisibleForTesting;

import java.util.*;


public class RPNCalculatorRoom7 {
  public double calculateOperation(ArrayList<Double> operands, String operator) {
    if(operator.equals("SQRT")) {
      return Math.sqrt((double) operands.remove(0));
    }
    else if(operator.equals("MAX")) {
      Double temp = (double) Collections.max(operands);
      operands.clear();
      return temp;
      //return (double) Arrays.stream(operands).max().getAsInt();
    }
    double first = (double)operands.remove(0),
            second = (double)operands.remove(0);
    if(operator.equals("/")) {
      return (double) first/second;
    }
    else if(operator.equals("*")) {
      return (double) first*second;
    }
    else if(operator.equals("-")) {
      return (double) first-second;
    }
    else if(operator.equals("+")) {
      return (double) first+second;
    }
    return 10.0;
  }
  public double calculateRPN(String[] args) {
    ArrayList<Double> operands = new ArrayList<>();
    for(String arg: args) {
      try {
        Integer number = Integer.parseInt(arg);
        operands.add(0,(double)number);
        //argCollection.add(number);
      } catch(NumberFormatException err) {
        Double temp = calculateOperation(operands,arg);
        operands.add(0,temp);
        //its an operand
        //argCollection.add(arg);
      }
    }
    return operands.get(0);
  }
  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}