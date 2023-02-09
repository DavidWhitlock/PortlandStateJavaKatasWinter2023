package edu.pdx.cs410J.room10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LagsRoom10Test
{

  @Test
  void canInstantiateKataClass() {
    new LagsRoom10("AF514", 0, 5, 10);
  }

  @Test
  void lagRoomNameEqualsName() {
    LagsRoom10 lagRoom = new LagsRoom10("AF514", 0, 5, 10);
    assertEquals(lagRoom.lag.name,"AF514");
    assertEquals(lagRoom.lag.startTime,0);
    assertEquals(lagRoom.lag.endTime,5);
    assertEquals(lagRoom.lag.profit,10);
  }
}