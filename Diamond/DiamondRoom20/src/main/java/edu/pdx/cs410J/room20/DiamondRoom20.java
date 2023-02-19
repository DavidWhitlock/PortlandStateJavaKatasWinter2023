package edu.pdx.cs410J.room20;

import com.google.common.annotations.VisibleForTesting;

public class DiamondRoom20 {

  //ASCII - 65 = A
  public String drawDiamond(char letter){
    letter = Character.toUpperCase(letter);
    if((int)letter == 65) return "A";
    //if((int)letter == 65+1) return " A\nB B\n A";
    int level = letter - 65;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= level; ++i) {
      if(i == 0){
        sb.append((char)(level+65));
        String spaces = "";
        for(int j = 0; j <= (((level-1)*2)+1); ++j){
          spaces += " ";
        }
        sb.append(spaces);
        sb.append((char)(level+65));
        sb.append("\n");
      }
      else {
        sb.append((char)(level+65-i));
        String spaces = "";
        for(int j = 0; j <= (((level-1)*2)+1); ++j){
          spaces += " ";
        }
        sb.append(spaces);
        sb.append((char)(level+65-i));
        sb.append("\n");


        sb.insert(0,(char)(level+65));
        sb.insert(0,spaces);
        sb.insert(0,(char)(level+65));
        sb.append("\n");
      }
    }

    return sb.toString();
  }

  @VisibleForTesting
  public static void main(String[] args) {


  }
}