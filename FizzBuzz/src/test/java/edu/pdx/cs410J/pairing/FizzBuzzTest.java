package edu.pdx.cs410J.pairing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest
{
  @Test
  void threeIsFizz(){
    assertThat(FizzBuzz.fizzBuzz(3), equalTo("fizz"));
  }

  @Test
  void fiveIsBuzz(){
    assertThat(FizzBuzz.fizzBuzz(5), equalTo("buzz"));
  }

  @Test
  void fifteenIsFizzBuzz(){
    assertThat(FizzBuzz.fizzBuzz(15), equalTo("fizzbuzz"));
  }

}
