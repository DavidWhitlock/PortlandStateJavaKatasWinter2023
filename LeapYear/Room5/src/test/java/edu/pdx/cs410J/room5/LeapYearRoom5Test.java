package edu.pdx.cs410J.room5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearRoom5Test
{

  @Test
  void canInstantiateKataClass() {
    new LeapYearRoom5();
  }


  @Test
  void twoThousandIsLeapYear()
  {
    assertTrue(LeapYearRoom5.isLeapYear(2000));
  }
}
