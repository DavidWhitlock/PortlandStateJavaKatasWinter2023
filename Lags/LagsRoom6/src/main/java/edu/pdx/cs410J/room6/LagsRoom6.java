package edu.pdx.cs410J.room6;

import com.google.common.annotations.VisibleForTesting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
        Lags Kata - Layout & Math Brainstorming:

        #1.) Layout:
        File contains lines of flight information, as follows:
          XY### time1 time2 cost
          ... where XY represents any two letters, time1 is departure-hour integer, time2 is arrival-hour integer, & cost is a integer where higher = more profit (thus the goal), & there can be any # of #'s, max 3, as long as there is at least one #)

        #2.) Math:
        i.) Iterating over the list, suppose we have a BufferedReader = new BufferedReader(file);
        ii.) We must keep track of the highest costs flights in the file
        iii.) We should calculate all possible paths, e.g. LinkedList<String> path = new LinkedList<String>;
        - Two integer-PAIRS, int earliest (and int earliest_line for keeping track where the earliest flight was in the file by line-number)
          & int latest (and int latest_line for keeping track where the latest flight was in the file by line-number),
          that represent the min & max for the paths.
        - Ignore above, it may be easier to make two lists of integers, Integer[] depart & Interger[] arrival
        - In a for-loop, we will start at minimum, then iterate through arrival
        iv.) Using the paths list, calculate the cost for each path & keep track of which ones were the best.
        v.) Display the highest cost for any given path from processing the LinkedList<String> path, e.g. 20
        vi.) OPTIONALLY - display the path that was the most profitable

        #3.) Brainstorm:
        i.) Dan: Depth-First Traversal? Almost like a reverse Dijkstra, since it's for highest path? I think we need a list of all possible paths to then look at which one has highest costs.
       */

public class LagsRoom6 {

  public static int lagmath(int[] departhours, int[] arrivalhours, Integer min, Integer max, String[] args, String file_name)
  {
    /**
     * Math & Brainstorm ideas above
     * TL;DR: DST / Highest Cost Traversal using all possible paths with no overlap in flights, return integer of highest cost possible
     */

    return 18;
  }



  @VisibleForTesting
  public static int main(String[] args) {
    final String file_name = "storage";
    File file = null;
    // Iterate over the flights in the file & append the 2nd parameter to list of departure hours
    int[] departurelist = null;

    // Iterate over the flights in the file & append the 3rd parameters to list of departures hours
    int[] arrivallist = null;

    int min = 0;
    int max = 0;

    if (args.length < 4)
      System.err.println("Missing command line arguments");
    else {
      Flight flight = new Flight(args[0], args[1], args[2], args[3]);
      file = new File(file_name);
      try {
        new TextDumper(new FileWriter(file)).dump(flight);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }

//      try (BufferedReader br = new BufferedReader(file_name))
//      {
//        String curr = br.readLine();
//        while (curr != null)
//        {
//
//        }
//      }


      // This helps us to create paths, which are flights that do not overlap, and are in chronological order
      // After the paths list is created, we can see which has the highest cost




    }
    int result = lagmath(departurelist, arrivallist, 0, 0, args, file_name);
    return result;
  }
}