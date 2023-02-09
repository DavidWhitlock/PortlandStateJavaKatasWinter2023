package edu.pdx.cs410J.room5;

import com.google.common.annotations.VisibleForTesting;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class LagsRoom5 {

    private Map<Integer, String[]> memo = new HashMap<>();


    @VisibleForTesting
    public static void main(String[] args) {

        System.err.println("Missing command line arguments");
    }

    public int memoize(String[] args) {
        int flightTime = 0;
        if (args.length == 0) {
            return Collections.min(memo.keySet());
        }
        try {
            String arg = args[0];
            String[] split = arg.split("\\s+");
            String flightName = split[0];
            int startTime = parseInt(split[1]);
            int duration = parseInt(split[2]);
            int profit = parseInt(split[3]);
        } catch (Exception e) {
            throw new NumberFormatException(e.getMessage());
        }
        if (memo.containsValue(args)) {
          return memo.entrySet().stream().filter(entry -> args == entry.getValue()).map(Map.Entry::getKey);
        }
//        if memo.containsKey()
    }
}