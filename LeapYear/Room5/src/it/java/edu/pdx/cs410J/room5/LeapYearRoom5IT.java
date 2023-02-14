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
  void shouldIssueErrorIfInputIsInvalid(){
    String[] args = new String[] {"-1995"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYearRoom5.class, args);
    assertThat(result.getTextWrittenToStandardError(), containsString("Invalid argument"));
  }

  /**
   * When the input is a valid year
   * and divisible by 400
   * the main method should print that
   * it is a leap year
   * */
  @Test
  void twoThousandIsAValidInputAndALeapYear(){
    String[] args = new String[] {"2000"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYearRoom5.class, args);
    assertThat(result.getTextWrittenToStandardOut(), containsString("is a leap year"));
  }

  /**
   * When the input is a valid year
   * and divisible by 100 but not by 400
   * the main method should print that
   * it is not a leap year
   * */
  @Test
  void twentyOneHundredIsAValidInputAndNotALeapYear(){
    String[] args = new String[] {"2100"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYearRoom5.class, args);
    assertThat(result.getTextWrittenToStandardOut(), containsString("is not a leap year"));
  }

  /**
   * When the input is a valid year
   * and divisible by 4 but not by 100
   * the main method should print that
   * it is a valid leap year
   * */
  @Test
  void twoThousandSixteenIsAValidInputAndALeapYear(){
    String[] args = new String[] {"2016"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYearRoom5.class, args);
    assertThat(result.getTextWrittenToStandardOut(), containsString("is a leap year"));
  }

  /**
   * When the input is a valid year
   * and not divisible by 4
   * the main method should print that
   * it is not a valid leap year
   * */
  @Test
  void twoThousandNineteenIsAValidInputAndALeapYear(){
    String[] args = new String[] {"2019"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYearRoom5.class, args);
    assertThat(result.getTextWrittenToStandardOut(), containsString("is not a leap year"));
  }

}
