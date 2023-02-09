package edu.pdx.cs410J.room1;

public class Request {
    String name;
    int startTime;
    int duration;
    int price;

    public Request(String name, int prc){
        this.name = name;
        this.startTime = 0;
        this.duration = 0;
        this.price = prc;

    }
    public Request(String name, int start, int dur, int prc){
        this.name = name;
        this.startTime = start;
        this.duration = dur;
        this.price = prc;
    }

    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }

}
