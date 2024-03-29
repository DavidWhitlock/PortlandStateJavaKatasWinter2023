package edu.pdx.cs410J.room1;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class MinesweeperRoom1IT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(MinesweeperRoom1.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }
/*
  @Test
  void grabsCommandLineInputCorrectly() {
  }
*/

}
