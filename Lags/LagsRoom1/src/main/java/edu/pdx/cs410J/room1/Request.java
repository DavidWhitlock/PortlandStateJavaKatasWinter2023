package edu.pdx.cs410J.room1;

public class Request {
    String name;
    int startTime;
    int duration;
    int price;

    public Request(String name, int start, int dur, int prc){
        this.name = name;
        this.startTime = start;
        this.duration = dur;
        this.price = prc;
    }
}
