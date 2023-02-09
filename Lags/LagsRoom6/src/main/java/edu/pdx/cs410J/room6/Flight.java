package edu.pdx.cs410J.room6;

public class Flight {
  String name;
  int startTime;
  int duration;
  int price;

  public Flight(String name, String startTime, String duration, String price) {
    this.name = name;
    this.startTime = Integer.parseInt(startTime);
    this.duration = Integer.parseInt(duration);
    this.price = Integer.parseInt(price);
  }

  public String getName() {
    return name;
  }

  public int getStartTime() {
    return startTime;
  }

  public int getDuration() {
    return duration;
  }

  public int getPrice() {
    return price;
  }
}
