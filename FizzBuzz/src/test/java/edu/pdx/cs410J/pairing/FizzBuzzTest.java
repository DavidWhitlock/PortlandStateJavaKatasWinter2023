package edu.pdx.cs410J.pairing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest
{
  @Test
  void threeIsFizz(){
    assertFizzBuzz(3, FizzBuzz.FIZZ);
  }

  private static void assertFizzBuzz(int number, String result) {
    assertThat(FizzBuzz.fizzBuzz(number), equalTo(result));
  }

  @Test
  void fiveIsBuzz(){
    assertFizzBuzz(5, FizzBuzz.BUZZ);
  }

  @Test
  void fifteenIsFizzBuzz(){
    assertFizzBuzz(15, FizzBuzz.FIZZBUZZ);


  }

  @Test
  void thirteenIs13() {
    assertFizzBuzz(13, "13");
  }

}
