package edu.pdx.cs410J.mobbing;

import org.junit.jupiter.api.Disabled;
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


  @Test
  void incrementPlayer1ScoreFromLoveTo40() {
    Tennis tennis = new Tennis();
    assertThat(tennis.getPlayer1Score(), equalTo(Tennis.Score.LOVE));
    tennis.IncrementPlayer1Score();
    assertThat(tennis.getPlayer1Score(), equalTo(Tennis.Score.FIFTEEN));
    tennis.IncrementPlayer1Score();
    assertThat(tennis.getPlayer1Score(), equalTo(Tennis.Score.THIRTY));
    tennis.IncrementPlayer1Score();
    assertThat(tennis.getPlayer1Score(), equalTo(Tennis.Score.FORTY));
  }

  @Test
  void incrementPlayer2ScoreFromLoveTo40() {
    Tennis tennis = new Tennis();
    assertThat(tennis.getPlayer2Score(), equalTo(Tennis.Score.LOVE));
    tennis.IncrementPlayer2Score();
    assertThat(tennis.getPlayer2Score(), equalTo(Tennis.Score.FIFTEEN));
    tennis.IncrementPlayer2Score();
    assertThat(tennis.getPlayer2Score(), equalTo(Tennis.Score.THIRTY));
    tennis.IncrementPlayer2Score();
    assertThat(tennis.getPlayer2Score(), equalTo(Tennis.Score.FORTY));
  }

  @Test
  @Disabled
  void whenBothPlayersHave40Player1ScoringGetAdvantage() {
    Tennis tennis = new Tennis();
    tennis.IncrementPlayer1Score();
    tennis.IncrementPlayer1Score();
    tennis.IncrementPlayer1Score();
    tennis.IncrementPlayer1Score();
    assertThat(tennis.getPlayer1Score(), equalTo(Tennis.Score.FORTY));
    
    tennis.IncrementPlayer2Score();
    tennis.IncrementPlayer2Score();
    tennis.IncrementPlayer2Score();
    tennis.IncrementPlayer2Score();
    assertThat(tennis.getPlayer2Score(), equalTo(Tennis.Score.FORTY));

    tennis.IncrementPlayer1Score();
    assertThat(tennis.getPlayer1Score(), equalTo(Tennis.Score.ADVANTAGE));
    assertThat(tennis.getPlayer2Score(), equalTo(Tennis.Score.FORTY));

  }
}
