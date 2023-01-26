package edu.pdx.cs410J.room10;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LeapYearRoom10IT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYearRoom10.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void invalidInputType() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYearRoom10.class, "test");
    assertThat(result.getTextWrittenToStandardError(), containsString("Invalid int"));
  }

  @Test
  void validInputType() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYearRoom10.class, "1");
    assertThat(result.getTextWrittenToStandardOut(), containsString("1 is NOT a leap year"));
  }
}
