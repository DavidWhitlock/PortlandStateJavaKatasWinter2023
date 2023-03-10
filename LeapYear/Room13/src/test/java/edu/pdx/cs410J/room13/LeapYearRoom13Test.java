package edu.pdx.cs410J.room13;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LeapYearRoom13Test
{

  @Test
  void canInstantiateKataClass() {
    new LeapYearRoom13();
  }

  @Test
  void assertDivisibleby400() {
    int year = 2000;
    assertThat(LeapYearRoom13.leapYearCheck(year),equalTo(true));
  }

  @Test
  void assertNotaYear() throws IOException {
    String[] year = {"-32"};
    assertThrows(IOException.class,() -> LeapYearRoom13.parseYearCheck(year));
  }
  @Test
  void assertDivisibleby100() {
    int year = 2100;
    assertThat(LeapYearRoom13.leapYearCheck(year),equalTo(false));
  }

  @Test
  void assertDivisibleby4() {
    int year = 2008;
    assertThat(LeapYearRoom13.leapYearCheck(year),equalTo(true));
  }

  @Test
  void assertNotDivisibleby4() {
    int year =2003;
    assertThat(LeapYearRoom13.leapYearCheck(year),equalTo(false));

  }

}
