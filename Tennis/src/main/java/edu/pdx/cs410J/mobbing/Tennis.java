package edu.pdx.cs410J.mobbing;

import com.google.common.annotations.VisibleForTesting;

public class Tennis {
  Score Player1 = Score.LOVE;
  Score Player2 = Score.LOVE;

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public void IncrementPlayerScore() {
    //create a switch here for Score increments
    if (Player1 == Score.LOVE){
      Player1 = Score.FIFTEEN;
    }
  }

  enum Score {
    LOVE,
    FIFTEEN,
    THIRTY,
    FORTY
  }

  public Score getPlayer1Score() {
    return Player1;
  }
}