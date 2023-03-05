package edu.pdx.cs410J.room3;

import com.google.common.annotations.VisibleForTesting;

import java.util.Map;

public class BankOCRRoom3 {
  public final static Map<String[], Integer> characterMapping = Map.of(
          new String[]{" _ ", "| |", "|_|"}, 0,
          new String[]{"  |","  |","  |"}, 1,
          new String[]{" _ ", " _|", "|_ "},2,
          new String[]{" _ "," _|", " _|"}, 3,
          new String[]{"   ", "|_|","  |"}, 4,
          new String[]{" _ ", "|_ ", " _|"}, 5
  );
  // x = 0-2, 3-5,
  // y = 0-2:q

  @VisibleForTesting
  public static int getMapping(String[] characterArray) {
    //if (characterMapping.containsKey(characterArray)) {
      return characterMapping.get(characterArray);
    //}

    //return -1;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length < 1) {
      System.err.println("Missing command line arguments");
    }
    System.out.println(characterMapping.get(0));
  }
}