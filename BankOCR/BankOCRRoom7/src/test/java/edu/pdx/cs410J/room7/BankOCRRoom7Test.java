package edu.pdx.cs410J.room7;

import org.junit.jupiter.api.Test;

public class BankOCRRoom7Test
{


  @Test
  void canInstantiateKataClass() {
    new BankOCRRoom7();

  }

  @Test
  void canPassInString(){
    BankOCRRoom7 room = new BankOCRRoom7();
    String first = "    _  _     _  _  _  _  _ ";
    room.toParseString(first);
    //assertThat()
  }

}
