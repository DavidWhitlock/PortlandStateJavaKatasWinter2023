package edu.pdx.cs410J.room3;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LagsRoom3Test
{
  LagsRoom3.Flight flight1 = new LagsRoom3.Flight(0,5,10);
  LagsRoom3.Flight flight2 = new LagsRoom3.Flight(3,7,14);
  LagsRoom3.Flight flight3 = new LagsRoom3.Flight(5,9,7);
  LagsRoom3.Flight flight4 = new LagsRoom3.Flight(6,9,8);


  @Test
  void canInstantiateKataClass() {
    new LagsRoom3();
  }

  @Test
  void testFlightStartTime() {
    LagsRoom3.Flight flight = new LagsRoom3.Flight(0, 5, 10);
    assertThat(0, equalTo(flight.startTime));
  }


  @Test
  void testFlgithtDuration() {
    LagsRoom3.Flight flight = new LagsRoom3.Flight(0,5,10);
    assertThat(5, equalTo(flight.duration));
  }
  @Test
  void testFlgithtPrice() {
    LagsRoom3.Flight flight = new LagsRoom3.Flight(0,5,10);
    assertThat(10, equalTo(flight.price));
  }

  @Test
  void testInvalidStartingTime() {
    LagsRoom3.Flight flight1 = new LagsRoom3.Flight(0,5,10);

    LagsRoom3.Flight flight2 = new LagsRoom3.Flight(3,7,14);

    assertFalse(LagsRoom3.Flight.valid(flight1, flight2));
  }

  @Test
  void testValidStartTime() {
    LagsRoom3.Flight flight1 = new LagsRoom3.Flight(0,5,10);

    LagsRoom3.Flight flight2 = new LagsRoom3.Flight(5,7,14);

    assertTrue(LagsRoom3.Flight.valid(flight1,flight2));

  }
  @Test
  void testPriceRatio() {
    assertThat(flight1.ratio, equalTo(flight2.ratio));
  }

}
