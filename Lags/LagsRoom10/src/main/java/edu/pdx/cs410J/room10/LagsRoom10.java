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

    public boolean comesBefore(Lag o){
      if(this.endTime < o.startTime)
        return true;
      return false;
    }
  }

  public int maxProfit(){
    int max = 0;

    for(int i = 0; i < lagList.size(); ++i){
      int temp = lagList.get(i).profit;
      int currentEnd = i;
      for(int j = 0; j < lagList.size(); ++j){
        if(i == j){
          continue;
        }
        if(lagList.get(j).comesBefore(lagList.get(currentEnd))){
          continue;
        }
        temp += lagList.get(j).profit;
        currentEnd = j;
        if(temp > max){
          max = temp;
        }
      }
    }

    return max;
  }

  @VisibleForTesting
  public static void main(String[] args) {

  }
}