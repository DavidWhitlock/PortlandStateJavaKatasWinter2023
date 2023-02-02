package edu.pdx.cs410J.room20;

import com.google.common.annotations.VisibleForTesting;

public class DiamondRoom20 {

  //ASCII - 65 = A
  public String drawDiamond(char letter){
    letter = Character.toUpperCase(letter);
    if((int)letter == 65) return "A";
    if((int)letter == 65+1) return " A\nB B\n A";
    return "" + letter;
  }

  @VisibleForTesting
  public static void main(String[] args) {


  }
}