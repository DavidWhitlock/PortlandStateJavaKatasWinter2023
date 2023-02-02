package edu.pdx.cs410J.room18;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DiamondRoom18Test
{

  @Test
  void testCorrectNumberLetterReturn() {
    int numberUserInput = (int) 'K';
    int numberA = (int) 'A';
    int result = numberUserInput - numberA;
    assertThat(result, equalTo(10));
  }

}
