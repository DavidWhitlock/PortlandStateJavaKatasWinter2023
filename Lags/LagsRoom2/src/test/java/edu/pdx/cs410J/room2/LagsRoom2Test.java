package edu.pdx.cs410J.room2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.*;

public class LagsRoom2Test
{

  @Test
  void canInstantiateKataClass() {
    new LagsRoom2();
  }

  @Test
  void canParseArgument(){
    String arg = "AFG105 0 5 10";
    String[] output = LagsRoom2.parse(arg);
    String[] desiredOutput = {"AFG105","0","5","10"};
    assertThat(output,equalTo(desiredOutput));
  }

  @Test
  void testFlightConstructor() {
    Flight flight = new Flight("A 1 2 3");
    assertThat(flight.flight, equalTo("A"));
    assertThat(flight.start, equalTo(1));
    assertThat(flight.end, equalTo(2));
    assertThat(flight.cost, equalTo(3));
  }

  @Test
  void overlappingFlightsAreMarkedIncompatible() {
    Flight flight1 = new Flight("A 0 5 10");
    Flight flight2 = new Flight("A 0 5 10");
    assertThat(LagsRoom2.checkCompatible(flight1,flight2),equalTo(false));
  }
  @Test
  void notOverlappingFlightsAreMarkedCompatible() {
    Flight flight1 = new Flight("A 0 5 10");
    Flight flight2 = new Flight("A 5 10 10");
    assertThat(LagsRoom2.checkCompatible(flight1,flight2),equalTo(true));
  }

  @Test
  void bestChoiceMethodReturnsCorrectValue(){
    assertThat(LagsRoom2.bestChoice(LagsRoom2.flightList),equalTo(18));
  }
  @Test
  void bestChoiceMethodReturnsCorrectValueFor2(){
    assertThat(LagsRoom2.bestChoice(LagsRoom2.flightList2),equalTo(22));
  }

  @Test
  void createsFlightList() {
    String [] flightList = {"AF514 0 5 10", "CO5 3 7 14"};
    Flight [] flightArray = LagsRoom2.createFlights(flightList);
    assertThat(flightArray[0].flight, equalTo("AF514"));
    assertThat(flightArray[1].start, equalTo(3));
    assertThat(flightArray[0].end, equalTo(5));
  }
}
