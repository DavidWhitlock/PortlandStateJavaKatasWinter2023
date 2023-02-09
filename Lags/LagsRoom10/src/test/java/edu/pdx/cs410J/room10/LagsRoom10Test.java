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

  @Test
  void checkArrayListLagObjectsAreSet(){
    LagsRoom10.Lag one = new LagsRoom10.Lag("AF514", 0 ,5,10);
    LagsRoom10.Lag two = new LagsRoom10.Lag("CO5", 3 ,7,14);
    LagsRoom10.Lag three = new LagsRoom10.Lag("AF515", 5 ,9,7);
    LagsRoom10.Lag four = new LagsRoom10.Lag("BA01", 6 ,9,8);
    LagsRoom10 compare = new LagsRoom10();
    compare.lagList.add(one);
    compare.lagList.add(two);
    compare.lagList.add(three);
    compare.lagList.add(four);
    assertEquals(compare.lagList.get(0),one);
    assertEquals(compare.lagList.get(1),two);
    assertEquals(compare.lagList.get(2),three);
    assertEquals(compare.lagList.get(3),four);
  }
}