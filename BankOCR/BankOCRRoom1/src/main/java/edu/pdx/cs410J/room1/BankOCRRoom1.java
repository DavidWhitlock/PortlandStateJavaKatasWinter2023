package edu.pdx.cs410J.room1;

import com.google.common.annotations.VisibleForTesting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BankOCRRoom1 {

  public static ArrayList<String> getOCRFromFile(String filePath) {
    //StringBuilder result = new StringBuilder();
    BufferedReader reader = null;

    ArrayList<String> arrayList = new ArrayList<>();

    try {
      reader = new BufferedReader(new FileReader(filePath));
    } catch (FileNotFoundException e) {
      System.err.println("Error reading file");
    }
    try {
      //result.append(reader.readLine());
      while(reader.ready()){
        arrayList.add(reader.readLine());

      }
    } catch (IOException e) {
      System.err.println("Error reading file");
    }

    return arrayList;

  }






  @VisibleForTesting
  public static void main(String[] args) {
    // System.err.println("Missing command line arguments");
    String path = "./sample.txt";
  }
}