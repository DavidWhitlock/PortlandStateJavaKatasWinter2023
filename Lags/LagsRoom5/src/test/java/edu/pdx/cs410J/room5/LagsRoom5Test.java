package edu.pdx.cs410J.room5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class LagsRoom5Test
{

  @Test
  void canInstantiateKataClass() {
    String[] args = {"AF514 0 5 10", "CO5 3 7 14", "AF515 5 9 7", "BA01 6 9 8"};
//    ArrayList<String> input = new ArrayList<>(Arrays.asList(args));
    new LagsRoom5();
    assert(1==1);
  }

}
