package edu.pdx.cs410J.room2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class BankOCRRoom2Test
{
  @Test
  void shouldValidateInputString() {
    BankOCRRoom2 bank = new BankOCRRoom2();
    String ip = " _  _  _  _  _  _  _  _  _ \n" +
            "| || || || || || || || || |\n" +
            "|_||_||_||_||_||_||_||_||_|\n";
    assertTrue(bank.validate(ip));
  }

  @Test
  void testInavlidInputString() {
    BankOCRRoom2 bank = new BankOCRRoom2();
    String ip = " a  _  _  _  _  _  _  _  _ \n" +
            "| || || || || || || || || |\n" +
            "|_||_||_||_||_||_||_||_||_|\n";
    assertFalse(bank.validate(ip));
  }

  @Test
  void testInValidStringWithCharsNotEqualTo27InEachLine() {
    BankOCRRoom2 bank = new BankOCRRoom2();
    String ip = "   _  _  _  _  _  _  _  _ \n" +
            "| || || || || || || || || |\n" +
            "|_||_||_||_||_||_||_||_||_|\n";
    assertFalse(bank.validate(ip));
  }

//  @Test
//  void testReturnAllZerosAccountNumber() {
//    BankOCRRoom2 bank = new BankOCRRoom2();
//    String ip = " _  _  _  _  _  _  _  _  _ \n" +
//            "| || || || || || || || || |\n" +
//            "|_||_||_||_||_||_||_||_||_|\n";
//    assertTrue(bank.parse(ip));
//  }

  @Test
  void testReturnFirstDigitIsZero() {
    BankOCRRoom2 bank = new BankOCRRoom2();
    String ip = " _  _  _  _  _  _  _  _  _ \n" +
            "| || || || || || || || || |\n" +
            "|_||_||_||_||_||_||_||_||_|\n";
    assertThat(bank.parse(ip), equalTo(0));
  }

  @Test
  void testFirstDigitIsOne(){
    BankOCRRoom2 bank = new BankOCRRoom2();
    String ip = "    _  _  _  _  _  _  _  _ \n" +
            "  || || || || || || || || |\n" +
            "  ||_||_||_||_||_||_||_||_|\n";
    assertThat(bank.parse(ip), equalTo(1));
  }

  @Test
  void testFirstDigitIsTwo(){
    BankOCRRoom2 bank = new BankOCRRoom2();
    String ip = " _  _  _  _  _  _  _  _  _ \n" +
            " _|| || || || || || || || |\n" +
            "|_ ||_||_||_||_||_||_||_||_|\n";
    assertThat(bank.parse(ip), equalTo(2));
  }
}
