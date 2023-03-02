package edu.pdx.cs410J.room3;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankOCRRoom3Test
{

  @Test
  void canInstantiateKataClass() {
    new BankOCRRoom3();
  }

  @Test
  void testExpectedNumberIsZero() {
    assertEquals(BankOCRRoom3.characterMapping.get(0), String.format(
             " _ \n| |\n|_|"));
  }

}
