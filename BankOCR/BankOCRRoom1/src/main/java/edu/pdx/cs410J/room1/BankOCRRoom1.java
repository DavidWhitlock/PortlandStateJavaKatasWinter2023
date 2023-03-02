package edu.pdx.cs410J.room1;

import com.google.common.annotations.VisibleForTesting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BankOCRRoom1 {

  public static StringBuilder getOCRFromFile(String filePath) {
    StringBuilder result = new StringBuilder();
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader(filePath));
    } catch (FileNotFoundException e) {
      System.err.println("Error reading file");
    }
    try {
      result.append(reader.readLine());
    } catch (IOException e) {
      System.err.println("Error reading file");
    }
  }

  @VisibleForTesting
  public static void main(String[] args) {
    // System.err.println("Missing command line arguments");
    String path = "./sample.txt";
  }
}