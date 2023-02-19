package edu.pdx.cs410J.room6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class LagsRoom6Test {

  @Test
  void canInstantiateKataClass() {
    new LagsRoom6();
  }

  @Test
  void initiateFLightWithInvalidStartTime() {
    assertThrows(NumberFormatException.class, () -> {
      new Flight("AF514", "abc", "5", "10");
    });
  }

  @Test
  void initiateFLightWithInvalidDuration() {
    assertThrows(NumberFormatException.class, () -> {
      new Flight("AF514", "1", "abc", "10");
    });
  }

  @Test
  void initiateFLightWithInvalidPrice() {
    assertThrows(NumberFormatException.class, () -> {
      new Flight("AF514", "5", "5", "abc");
    });
  }

  @Test
  void initiateFLightWithInvalidInputs() {
    assertThrows(NumberFormatException.class, () -> {
      new Flight("AF514", "abc", "5", "10");
    });
  }

}
