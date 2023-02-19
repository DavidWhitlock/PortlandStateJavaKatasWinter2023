package edu.pdx.cs410J.room1;

import com.google.common.annotations.VisibleForTesting;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LagsRoom1 {


  @VisibleForTesting
  public static void main(String[] args) {
    //System.err.println("Missing command line arguments");

    List<Request> requests = new ArrayList<>();
    requests.add(new Request("AF514", 0, 5, 10));
    requests.add(new Request("CO5" , 3, 7, 14));
    requests.add(new Request("AF515",  5, 9, 7));
    requests.add(new Request("BA01", 6, 9, 8));

    //List<Request> bestRoute = new ArrayList<>();
    //List<Request> test = new ArrayList<>();
    Request best;
    Request test;

    for(int i = 0; i < requests.size() - 1; ++i){
      //test.add(requests.get(i));

      for(int j = i+1; j < requests.size(); ++j){
        if((requests.get(i).duration + requests.get(i).startTime) <= (requests.get(j).startTime)){
          //test(requests.get(j));
//          test(requests.get(i).name + requests.get(j).name,  requests.get(i).price + requests.get(j).price);
        }
      }//end for

    }//

    System.out.println("TEST ROUTE:\n");
    //for (int i = 0; i < test.size(); ++i){
//      System.out.println(test.name + " " + test.price);
    //}




  }//end main
    // BEST AF514 + BA01 :: TOTAL_PRICE 18
    //
    //
    // AF514 + BA01
    // totalStart 6
    // totalDur 14
    // total 20
    // price 18

}