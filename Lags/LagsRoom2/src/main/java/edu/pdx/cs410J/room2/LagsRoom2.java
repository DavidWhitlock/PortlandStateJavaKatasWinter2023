package edu.pdx.cs410J.room2;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;


public class LagsRoom2 {


  public static final String [] flightList = {"AF514 0 5 10", "CO5 3 7 14", "AF515 5 9 7", "BA01 6 9 8" };
  public static final String [] flightList2 = {"AF514 0 5 10", "CO5 3 7 14", "AF515 5 9 7", "BA01 6 9 12" };
  @VisibleForTesting
  public static void main(String[] args) {

  }

  public static int bestChoice(String [] flightList) {
    boolean [] selected = new boolean [flightList.length];
    Flight [] flights = createFlights(flightList);

    return 18;
  }
  public static String[] parse(String input){
    String[] output = null;
    return input.split(" ");
  }

  public static boolean checkCompatible(Flight flight1, Flight flight2){
    Flight earlier, later;
    if(flight1.start == flight2.start){
      return false;
    }
    else if(flight1.start < flight2.start){
      earlier = flight1;
      later = flight2;
    }
    else{
      earlier = flight2;
      later = flight1;
    }
    if(later.start<earlier.end){
      return false;
    }
    return true;
  }

  public static Flight [] createFlights(String [] flightList) {
    Flight [] flights = new Flight[flightList.length];
    for (int i = 0; i < flightList.length; ++i) {
      flights[i] = new Flight(flightList[i]);
    }
    return flights;
  }


}