package edu.pdx.cs410J.room5;

import com.google.common.annotations.VisibleForTesting;

import java.util.*;

import static java.lang.Integer.parseInt;

public class LagsRoom5 {

    private class Flight {
        private String flightNumber;
        private int startTime;
        private int duration;
        private int profit;

        public Flight(String flightNumber, int startTime, int duration, int profit) {
            this.flightNumber = flightNumber;
            this.startTime = startTime;
            this.duration = duration;
            this.profit = profit;
        }
    }
    private Map<List<Flight>, Integer> memo = new HashMap<>();

    private List<Flight> flights = new ArrayList<>();


    @VisibleForTesting
    public static void main(String[] args) {
        ArrayList<String> idk = new ArrayList<>(Arrays.asList(args));
        System.err.println("Missing command line arguments");
    }

    private void readIn(String[] args) {
        for(String arg: args) {
            String[] split = arg.split("\\s+");
            Flight f = new Flight(split[0],parseInt(split[1]),parseInt(split[2]),parseInt(split[3]));
            this.flights.add(f);
        }
    }

    public int memoize(List<Flight> f) {
        if (f.size() == 0) {
            return Collections.max(memo.values());
        }
        if (memo.containsKey(f)) {
            return memo.get(f);
        }
        Flight thisFlight = f.get(0);

        return 1;
    }
}