package edu.pdx.cs410J.room18;

import com.google.common.annotations.VisibleForTesting;

public class DiamondRoom18 {

  @VisibleForTesting
  public static void main(String[] args) {
    final String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    final int numberA = (int) 'A';

    //line width is (N * 2 - 1) where N-index = position of letter
    //input is Character
    int numberUserInput = (int) args[0].toUpperCase().charAt(0);
    //subtract input to A to get N-index
    int letterIndex = numberUserInput - numberA;

    System.out.println(letterIndex);
  }
}