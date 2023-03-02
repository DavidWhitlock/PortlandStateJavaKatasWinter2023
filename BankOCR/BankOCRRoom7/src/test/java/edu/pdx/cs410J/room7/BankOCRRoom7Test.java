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

  @Test
  void testAllNumbers(){
    BankOCRRoom7 room = new BankOCRRoom7();
    String zero = " _ | ||_|";
    assertThat(room.ZERO,equalTo(zero));
    String one = "     |  |";
    assertThat(room.ONE,equalTo(one));
    String two = " _  _||_ ";
    assertThat(room.TWO,equalTo(two));
    String three = " _  _| _|";
    assertThat(room.THREE,equalTo(three));
    String four = "   |_|  |";
    assertThat(room.FOUR,equalTo(four));
    String five = " _ |_  _|";
    assertThat(room.FIVE,equalTo(five));
    String six = " _ |_ |_|";
    assertThat(room.SIX,equalTo(six));
    String seven = " _   |  |";
    assertThat(room.SEVEN,equalTo(seven));
    String eight = " _ |_||_|";
    assertThat(room.EIGHT,equalTo(eight));
    String nine = " _ |_| _|";
    assertThat(room.NINE,equalTo(nine));
  }

}
