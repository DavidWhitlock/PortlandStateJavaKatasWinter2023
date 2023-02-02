package edu.pdx.cs410J.room18;

import com.google.common.annotations.VisibleForTesting;

import java.text.MessageFormat;

public class DiamondRoom18 {

  public static int returnLineWidth(String[] args) {
    final int numberA = (int) 'A';

    //line width is (N * 2 - 1) where N-index = position of letter
    //input is Character
    int numberUserInput = (int) args[0].toUpperCase().charAt(0);
    //subtract input to A to get N-index
    int letterIndex = numberUserInput - numberA;

    int numberSpaces = (letterIndex +1)*2 -1;
    return numberSpaces;
  }

  /**
   * <p>Recursive function to print letter diamond</p>
   * @param
   */
  public static void printLetterDiamond(int lineWidth, int line) {
    //
    // Step 1: get center point, where A will be printed
    if(line == 0)
    int midPoint = lineWidth/2;


    System.out.println(String.format(MessageFormat.format("%{0}c",lineWidth)));
  }
  @VisibleForTesting
  public static void main(String[] args) {
    final String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    final int numberA = (int) 'A';

    //line width is (N * 2 - 1) where N-index = position of letter
    //input is Character
    int numberUserInput = (int) args[0].toUpperCase().charAt(0);
    //subtract input to A to get N-index
    int letterIndex = numberUserInput - numberA;

    int numberSpaces = (letterIndex +1)*2 -1;

    System.out.println(letterIndex);
  }
}