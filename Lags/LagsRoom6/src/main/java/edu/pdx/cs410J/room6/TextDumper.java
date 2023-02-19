package edu.pdx.cs410J.room6;

import java.io.PrintWriter;
import java.io.Writer;

public class TextDumper {
  private final Writer writer;

  public TextDumper(Writer writer) {
    this.writer = writer;
  }

  public void dump(Flight flight) {
    try (PrintWriter pw = new PrintWriter(this.writer)) {
      String[] array = {flight.getName(), String.valueOf(flight.getStartTime()), String.valueOf(flight.getDuration()), String.valueOf(flight.getPrice())};
      pw.println(String.join(",", array));
      pw.flush();
    }
  }
}
