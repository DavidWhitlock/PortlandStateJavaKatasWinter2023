package edu.pdx.cs410J.room5;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LeapYearRoom5IT extends InvokeMainTestCase {

  /**
   * When the input is -ve integer
   * the main method should
   * print out an error message
   * */
  @Test
  void checkIfInputIsValid(){
    String[] args = new String[] {"-1995"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYearRoom5.class, args);
    assertThat(result.getTextWrittenToStandardError(), containsString("Invalid argument"));
  }

}
