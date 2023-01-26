package edu.pdx.cs410J.room7;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LeapYearRoom7IT extends InvokeMainTestCase {

  private MainMethodResult invokeMain(String... args) {
    return invokeMain( LeapYearRoom7.class, args );
  }
  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain();
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing arguments"));
  }

  @Test
  void checkNonNumericIsLeapYear() {
    InvokeMainTestCase.MainMethodResult result = invokeMain("abcd");
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing arguments"));
  }

}
