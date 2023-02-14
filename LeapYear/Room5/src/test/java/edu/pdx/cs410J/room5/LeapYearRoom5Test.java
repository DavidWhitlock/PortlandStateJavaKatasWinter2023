package edu.pdx.cs410J.room5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearRoom5Test
{

  @Test
  void canInstantiateKataClass() {
    new LeapYearRoom5();
  }


  @Test
  void twoThousandIsLeapYear() {
    assertTrue(LeapYearRoom5.isLeapYear(2000));
  }

  @Test
  void twentyOneHundredIsNotALeapYear(){
    assertFalse(LeapYearRoom5.isLeapYear(2100));
  }

  @Test
  void twoThousandAndEightIsALeapYear(){
    assertTrue(LeapYearRoom5.isLeapYear(2008));
  }

  @Test
  void twoThousandAndEighteenIsNotALeapYear(){
    assertFalse(LeapYearRoom5.isLeapYear(2018));
  }

}
