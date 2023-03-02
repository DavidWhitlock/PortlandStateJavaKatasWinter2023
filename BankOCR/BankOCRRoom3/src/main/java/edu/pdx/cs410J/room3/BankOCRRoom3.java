package edu.pdx.cs410J.room3;

import com.google.common.annotations.VisibleForTesting;

import java.util.Map;

public class BankOCRRoom3 {
  public final static Map<Integer, String[]> characterMapping = Map.of(
          0, new String[]{" _ ", "| |", "|_|"},
          1, new String[]{"  |","  |","  |"},
          2, new String[]{" _ ", " _|", "|_ "},
          3, new String[]{" _ "," _|", " _|"},
          4, new String[]{"   ", "|_|","  |"},
          5, new String[]{" _ ", "|_ ", " _|"}
  );
  // x = 0-2, 3-5,
  // y = 0-2:q
  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length < 1) {
      System.err.println("Missing command line arguments");
    }
    System.out.println(characterMapping.get(0));
  }
}