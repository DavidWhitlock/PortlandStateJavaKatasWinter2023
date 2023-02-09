package edu.pdx.cs410J.room2;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;


public class LagsRoom2 {


  String [] flightList = {"AF514 0 5 10", "CO5 3 7 14", "AF515 5 9 7", "BA01 6 9 8" };
  @VisibleForTesting
  public static void main(String[] args) {



  }

  public static String[] parse(String input){
    String[] output = null;
    return input.split(" ");
  }

  /*
  public static void populateList(ArrayList<String> list){
    String flight1 = "AF514 0 5 10";
    String flight2 = "CO5 3 7 14";
    String flight3 = "AF515 5 9 7";
    String flight4 = "BA01 6 9 8";
    for(){

    }
  }
   */
}