package edu.pdx.cs410J.room13;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DiamondRoom13Test
{

  @Test
  void a() {
    String diamond =
      "A";
    assertThat(DiamondRoom13.diamond('A'), equalTo(diamond));
  }

}
