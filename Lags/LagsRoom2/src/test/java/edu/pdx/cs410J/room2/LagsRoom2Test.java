package edu.pdx.cs410J.room2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.*;

public class LagsRoom2Test
{

  @Test
  void canInstantiateKataClass() {
    new LagsRoom2();
  }

  @Test
  void canParseArgument(){
    String arg = "AFG105 0 5 10";
    String[] output = LagsRoom2.parse(arg);
    String[] desiredOutput = {"AFG105","0","5","10"};
    assertThat(output,equalTo(desiredOutput));
  }

  @Test
  void
}
