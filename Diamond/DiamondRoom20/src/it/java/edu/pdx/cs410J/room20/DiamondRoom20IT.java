package edu.pdx.cs410J.room20;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class DiamondRoom20IT extends InvokeMainTestCase {

  @Test
  @Disabled
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(DiamondRoom20.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }


}
