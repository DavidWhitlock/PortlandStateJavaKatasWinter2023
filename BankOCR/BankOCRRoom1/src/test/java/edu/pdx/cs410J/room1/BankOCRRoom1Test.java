package edu.pdx.cs410J.room1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.File;
import java.io.FileReader;

import org.junit.jupiter.api.Test;
// import 
public class BankOCRRoom1Test
{

  @Test
  void canInstantiateKataClass() {
    new BankOCRRoom1();
  }
  @Test
  void canPasstheStory1(){
    // | _| _||_||_ |_   ||_||_|
    // ||_  _|  | _||_|  ||_| _|
    String path = "sample.txt";
    FileReader reader = new FileReader(path);
    // assertArrayEquals(null, null, 0, path);
  }

}
