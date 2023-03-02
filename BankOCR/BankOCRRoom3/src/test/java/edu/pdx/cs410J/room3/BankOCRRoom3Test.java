package edu.pdx.cs410J.room3;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankOCRRoom3Test
{

  @Test
  void canInstantiateKataClass() {
    new BankOCRRoom3();
  }

  @Test
  void testExpectedNumberIsZero() {
    assertThat(BankOCRRoom3.getMapping(new String[]{" _ ", "| |", "|_|"}), equalTo(0));
  }

}
