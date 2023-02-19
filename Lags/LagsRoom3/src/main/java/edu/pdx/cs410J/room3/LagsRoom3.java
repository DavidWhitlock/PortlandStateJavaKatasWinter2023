package edu.pdx.cs410J.room3;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;

public class LagsRoom3 {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

//  public static boolean valid(Flight flight1, Flight flight2) {
//  }

  @VisibleForTesting
  public static class Flight {
    public int startTime;
    public int duration;
    public int price;
    public float ratio;


    public Flight(int startTime, int duration, int price) {
      this.startTime = startTime;
      this.duration =duration;
      this.price = price;
      this.ratio = (float)price/duration;
    }
    
    public static boolean valid(Flight flight1, Flight flight2) {
      if ((flight1.startTime+flight1.duration) > (flight2.startTime)) {
        return false;
      }
      return true;
    }

    public static void bestCombo(ArrayList<Flight> flights1) {
      ArrayList<Flight> flights2 = flights1;

      int counter = 0;
      for (int i = 0; i < flights1.size(); i++) {
        for (int j = 0; j < flights1.size(); j++) {
          if (i != j) {
            if (valid(flights1.get(i), flights2.get(j))) {
              if (flights1.get(i).ratio >= flights2.get(j).ratio)  {
                counter += flights1.get(i).price;
              }
              else {
                counter += flights2.get(j).price;
              }
            }
          }
        }
      }
    }

  }

}