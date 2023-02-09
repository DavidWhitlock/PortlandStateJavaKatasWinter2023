package edu.pdx.cs410J.room5;

import com.google.common.annotations.VisibleForTesting;

import java.util.HashMap;
import java.util.Map;

public class LagsRoom5 {

  private Map<Integer, String> memo = new HashMap<>();

  @VisibleForTesting
  public static void main(String[] args) {

    System.err.println("Missing command line arguments");
  }

  public static void memoize(String[] args) {
    if (args.length == 0) {
      return;
    }
    for(String arg : args) {
      String[] split = arg.split("\\s+");

    }
  }
}