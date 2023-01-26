package edu.pdx.cs410J.pairing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest
{
  @Test
  void theWordThreeIsFizz(){
    assertThat(FizzBuzz.fizzBuzz(3), equalTo("fizz"));
  }

}
