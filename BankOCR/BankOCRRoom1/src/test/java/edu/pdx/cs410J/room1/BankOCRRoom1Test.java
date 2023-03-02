package edu.pdx.cs410J.room1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.*;

import org.junit.jupiter.api.Test;
// import 
public class BankOCRRoom1Test
{
  String path = "./sample.txt";
  @Test
  void canInstantiateKataClass(){
    new BankOCRRoom1();
  }
  @Test
  void canPasstheStory1() throws IOException {
    // | _| _||_||_ |_   ||_||_|
    // ||_  _|  | _||_|  ||_| _|
    String path = "./sample.txt";
    FileReader reader = new FileReader(path);
    assertTrue(reader.ready());
  }

  @Test
  void canReadInputFile() throws IOException {
    //String []
    BufferedReader reader = new BufferedReader(new FileReader(path));
    reader.readLine();
  }

}
