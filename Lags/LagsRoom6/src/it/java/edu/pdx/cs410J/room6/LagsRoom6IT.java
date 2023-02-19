package edu.pdx.cs410J.room6;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LagsRoom6IT extends InvokeMainTestCase {

  private MainMethodResult invokeMain(String... args) {
    return invokeMain(LagsRoom6.class, args);
  }

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain();
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  @Disabled
  void invokingMainWithAllValid() {
    InvokeMainTestCase.MainMethodResult result = invokeMain("AF514", "0", "5", "10");
    assertThat(result.getTextWrittenToStandardOut(), equalTo(10));
  }

  @Test
  @Disabled
  void invokingMainWithEvaluate() {
    InvokeMainTestCase.MainMethodResult result = invokeMain("BA01", "6", "9", "8");
    assertThat(result.getTextWrittenToStandardOut(), equalTo(18));
  }

}
