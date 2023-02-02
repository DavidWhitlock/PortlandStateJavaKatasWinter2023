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
  public static void printLetterDiamond(int lineWidth, int line, String[] alphabet) {
    // Step 1: get center point, where A will be printed
    //int line increments

    //VARIABLES
    char printLetter = alphabet[line].charAt(0);
    int secondSpace = 0;
    int midPoint = lineWidth/2;
    System.out.println(midPoint);

    if(midPoint - line == 0){
      System.out.println(String.format(MessageFormat.format("%{0}c%{1}c",(midPoint-line), line), printLetter, printLetter));
      return;
    }

    //increment middle spacing +1 every time, until it reaches
    //stop recursion when: (1) midPoint - lineWidth == 0, (2) or if printLetter is our User input

    if(printLetter == 'A') {
      System.out.println(String.format(MessageFormat.format("%{0}c",midPoint), printLetter));
    }
    else {
      System.out.println(String.format(MessageFormat.format("%{0}c%{1}c",(midPoint-line), line), printLetter, printLetter));
    }
    line++;
    printLetterDiamond(lineWidth, line, alphabet);
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