package edu.pdx.cs410J.room6;

import com.google.common.annotations.VisibleForTesting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LagsRoom6 {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length < 4)
      System.err.println("Missing command line arguments");
    else {
      Flight flight = new Flight(args[0], args[1], args[2], args[3]);
      File file = new File("storage");
      try {
        new TextDumper(new FileWriter(file)).dump(flight);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}