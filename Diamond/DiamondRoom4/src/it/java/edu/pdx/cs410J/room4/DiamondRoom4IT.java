package edu.pdx.cs410J.room4;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class DiamondRoom4IT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(DiamondRoom4.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }


}
