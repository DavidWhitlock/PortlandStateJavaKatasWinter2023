package edu.pdx.cs410J.room1;

import edu.pdx.cs410J.InvokeMainTestCase;
import edu.pdx.cs410J.room10.LagsRoom10;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LagsRoom10IT extends InvokeMainTestCase {

  @Test
  @Disabled
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LagsRoom10.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }


}
