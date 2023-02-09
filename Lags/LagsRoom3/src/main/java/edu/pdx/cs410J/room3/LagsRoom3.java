package edu.pdx.cs410J.room3;

import com.google.common.annotations.VisibleForTesting;

public class LagsRoom3 {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  @VisibleForTesting
  public class Flight {
    public int startTime;
    public int duration;
    public int price;

    public Flight(int startTime, int duration, int price) {
      this.startTime = startTime;
      this.duration =duration;
      this.price = price;
    }
  }

}