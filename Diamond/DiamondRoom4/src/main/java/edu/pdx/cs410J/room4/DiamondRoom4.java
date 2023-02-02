package edu.pdx.cs410J.room4;

import java.util.ArrayList;
import com.google.common.annotations.VisibleForTesting;

public class DiamondRoom4 {
  public String[] lettersInOrder = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
  public void makeDiamond(String letter){
    int counter = 0;
    ArrayList<String> shapeSegments = new ArrayList<String>();
    for(int i = 0; i < this.lettersInOrder.length; i++){
      if (letter.equals(this.lettersInOrder[i])){
        i = 99;
      }
      counter += 1;
    }
    int j = 0;
    String temp;
    while(counter > 0){
      if (j == 0) { // the pointy edge
        temp = " ".repeat(counter) + lettersInOrder[0];
        System.out.println(temp);
      }
      else {
        temp = " ".repeat(counter) + lettersInOrder[j] + " ".repeat(j*2) + lettersInOrder[j];
        System.out.println(temp);
      }
      shapeSegments.add(temp);
      counter--;
      j++;
    }
    for (int i = shapeSegments.size()-1; i >= 0; i--){
      System.out.println(shapeSegments.get(i));
    }
  }
  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      return;
    }
    System.out.println("hi!");
    DiamondRoom4 dr4 = new DiamondRoom4();
    //System.out.println(args[0]);
    dr4.makeDiamond(args[0]);

  }
}