package edu.pdx.cs410J.room2;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DiamondRoom2Test
{
  @Test
  void printsTheCorrectPatternForA(){
    assertThat(DiamondRoom2.createDiamond('A'), equalTo("A"));
  }

  @Test
  void printsTheCorrectPatternForB(){
    assertThat(DiamondRoom2.createDiamond('B'), equalTo(" A \nB B\n A \n"));
  }

}
