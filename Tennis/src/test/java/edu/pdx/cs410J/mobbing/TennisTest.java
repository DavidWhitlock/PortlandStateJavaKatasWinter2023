package edu.pdx.cs410J.mobbing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TennisTest {

  @Test
  void canInstantiateFizzBuzzClass() {
    new Tennis();
  }

  @Test
  void initiallyEachPlayerScoreZero() {
    Tennis tennis = new Tennis();
    assertThat(tennis.getPlayer1Score(), equalTo(Tennis.Score.LOVE));
  }

}
