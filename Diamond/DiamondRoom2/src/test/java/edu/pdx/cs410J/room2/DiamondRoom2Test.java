package edu.pdx.cs410J.room2;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
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

  @Test
  void printsTheCorrectPatternForC(){
    var pattern = DiamondRoom2.createDiamond('C');
    assertThat(pattern, equalTo("  A  \n B B \nC   C\n B B \n  A  \n"));
  }

  @Test
  void printsTheCorrectPatternForD(){
    var pattern = DiamondRoom2.createDiamond('D');
    assertThat(pattern, equalTo("   A   \n  B B  \n C   C \nD     D\n C   C \n  B B  \n   A   \n"));
  }
}
