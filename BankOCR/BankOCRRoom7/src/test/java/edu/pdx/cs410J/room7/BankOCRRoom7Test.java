package edu.pdx.cs410J.room7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.engine.discovery.predicates.IsTestClassWithTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    assertThat(room.validateString(first), equalTo(true));
  }

  @Test
  void isNot27Characters() {
    BankOCRRoom7 room = new BankOCRRoom7();
    String first = "pain";
    //room.toParseString(first);
    assertThrows(Exception.class, () -> room.validateString(first));
  }


}
