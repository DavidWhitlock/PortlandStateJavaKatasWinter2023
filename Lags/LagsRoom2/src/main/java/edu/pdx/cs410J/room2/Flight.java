package edu.pdx.cs410J.room2;

public class Flight {
    public String flight;
    public int start;
    public int end;
    public int cost;

    Flight (String input) {
        this.flight = input.split(" ")[0];
        this.start = Integer.parseInt(input.split(" ")[1]);
        this.end = Integer.parseInt(input.split(" ")[2]);
        this.cost = Integer.parseInt(input.split(" ")[3]);
    }
}