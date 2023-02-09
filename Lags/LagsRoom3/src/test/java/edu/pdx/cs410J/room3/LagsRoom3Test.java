package edu.pdx.cs410J.room3;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LagsRoom3Test
{

  @Test
  void canInstantiateKataClass() {
    new LagsRoom3();
  }

  @Test
  void testFlightStartTime() {
    Flight flight = new Flight(0, 5, 10);
    assertThat(0, equalTo(flght.startTime));
  }

}
