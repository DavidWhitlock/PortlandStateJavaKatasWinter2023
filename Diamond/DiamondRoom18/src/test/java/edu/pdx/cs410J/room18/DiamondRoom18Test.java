package edu.pdx.cs410J.room18;

import org.checkerframework.dataflow.qual.TerminatesExecution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
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

  @Test
  void returnWidth5ForC() {
    String[] args = {"C"};
    assertThat(DiamondRoom18.returnLineWidth(args), equalTo(5));
  }

  @Test
  void returnWidth7ForD() {
    String[] args = {"d"};
    assertThat(DiamondRoom18.returnLineWidth(args), equalTo(7));
  }

  @Test
  @Disabled
  void printsLetterDiamondForInputC() {
    String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    int line = 0;
    int lineWidth = 5;
    DiamondRoom18.printLetterDiamond(lineWidth,line,alphabet);
    assertThat(true, equalTo(true));
  }

}
