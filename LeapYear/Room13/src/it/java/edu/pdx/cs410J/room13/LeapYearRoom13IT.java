package edu.pdx.cs410J.room13;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LeapYearRoom13IT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYearRoom13.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void assertThrowsIOException() {
    String[] args = {"blarg"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYearRoom13.class, args);
    assertThat(result.getTextWrittenToStandardError(), containsString("Unable to parse year.  Not an integer."));
  }


}
