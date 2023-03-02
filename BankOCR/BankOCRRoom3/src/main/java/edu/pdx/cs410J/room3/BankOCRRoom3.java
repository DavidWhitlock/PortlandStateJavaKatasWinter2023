package edu.pdx.cs410J.room3;

import com.google.common.annotations.VisibleForTesting;

import java.util.HashMap;
import java.util.Map;

public class BankOCRRoom3 {
  public final static Map<Integer, String> characterMapping = Map.of(
          0, " _ \n" +
             "| |\n" +
             "|_|\n"
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