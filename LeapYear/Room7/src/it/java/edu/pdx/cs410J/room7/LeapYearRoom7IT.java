package edu.pdx.cs410J.room7;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static edu.pdx.cs410J.room7.LeapYearRoom7.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LeapYearRoom7IT extends InvokeMainTestCase {

  private MainMethodResult invokeMain(String... args) {
    return invokeMain(LeapYearRoom7.class, args);
  }

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain();
    assertThat(result.getTextWrittenToStandardError(), containsString(MISSING_ARGUMENTS));
  }

  @Test
  void checkNonNumericIsLeapYear() {
    InvokeMainTestCase.MainMethodResult result = invokeMain("abcd");
    assertThat(result.getTextWrittenToStandardError(), containsString(INVALID_INPUT_YEAR));
  }

  @Test
  void checkMultipleArgumentsReturnsError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain("2012", "2000");
    assertThat(result.getTextWrittenToStandardError(), containsString(TOO_MANY_ARGUMENTS));
  }

  @Test
  void check2020IsLeapYear() {
    InvokeMainTestCase.MainMethodResult result = invokeMain("2020");
    assertThat(result.getTextWrittenToStandardOut(), containsString("true"));
  }

}
