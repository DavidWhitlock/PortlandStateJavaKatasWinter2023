package edu.pdx.cs410J.room1;

import com.google.common.annotations.VisibleForTesting;

import java.util.LinkedList;
import java.util.List;

public class LagsRoom1 {


  @VisibleForTesting
  public static void main(String[] args) {
    //System.err.println("Missing command line arguments");

    List<Request> requests = new LinkedList<>();
    requests.add(new Request("AF514", 0, 5, 10));
    requests.add(new Request("CO5" , 3, 7, 14));
    requests.add(new Request("AF515",  5, 9, 7));
    requests.add(new Request("BA01", 6, 9, 8));
    
  }


}