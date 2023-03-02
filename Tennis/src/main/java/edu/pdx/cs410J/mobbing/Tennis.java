package edu.pdx.cs410J.mobbing;

import com.google.common.annotations.VisibleForTesting;

public class Tennis {
  Score Player1 = Score.LOVE;
  Score Player2 = Score.LOVE;

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public void IncrementPlayer1Score() {
    Player1 = incrementPlayerScore(Player1);
  }

  private Score incrementPlayerScore(Score score) {
    if (score == Score.LOVE){
      return Score.FIFTEEN;
    } else if (score == Score.FIFTEEN){
      return Score.THIRTY;
    } else if (score == Score.THIRTY) {
      return Score.FORTY;

    } else if (score == Score.FORTY) {
      return Score.ADVANTAGE;

    } else {
      return score;
    }
  }

  public void IncrementPlayer2Score() {
    Player2 = incrementPlayerScore(Player2);
  }

  enum Score {
    LOVE,
    FIFTEEN,
    THIRTY,
    FORTY,
    ADVANTAGE
  }

  public Score getPlayer1Score() {
    return Player1;
  }

  public Score getPlayer2Score() {
    return Player2;
  }
}