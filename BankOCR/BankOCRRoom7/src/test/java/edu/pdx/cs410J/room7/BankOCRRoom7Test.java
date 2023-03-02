package edu.pdx.cs410J.room7;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BankOCRRoom7Test
{


  @Test
  void canInstantiateKataClass() {
    new BankOCRRoom7();

  }

  @Test
  void canPassInString() throws Exception {
    BankOCRRoom7 room = new BankOCRRoom7();
    String first = "    _  _     _  _  _  _  _ ";
    //room.toParseString(first);
    assertThat(room.validateString(first), equalTo(27));
  }

}
