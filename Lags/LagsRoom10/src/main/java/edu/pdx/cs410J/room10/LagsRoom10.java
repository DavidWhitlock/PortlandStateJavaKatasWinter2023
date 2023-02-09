package edu.pdx.cs410J.room10;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.List;

public class LagsRoom10 {

  public Lag lag = null;
  public List<Lag> lagList = new ArrayList<>();


  public LagsRoom10(){

  }
  public LagsRoom10(String name, int startTime, int endTime, int profit){
      lag = new Lag(name, startTime, endTime, profit);
  }

  static class Lag {
    public String name = "";
    public int startTime = 0;
    public int endTime = 0;
    public int profit = 0;

    public Lag(String name, int startTime, int endTime, int profit){
      this.name = name;
      this.startTime = startTime;
      this.endTime = endTime;
      this.profit = profit;
    }
  }
  @VisibleForTesting
  public static void main(String[] args) {

  }
}