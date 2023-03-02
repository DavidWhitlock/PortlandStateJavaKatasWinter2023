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
    //create a switch here for Score increments
    if (Player1 == Score.LOVE){
      Player1 = Score.FIFTEEN;
    } else if (Player1 == Score.FIFTEEN){
      Player1 = Score.THIRTY;
    } else if (Player1 == Score.THIRTY){
      Player1 = Score.FORTY;
    }
  }

  public void IncrementPlayer2Score() {
    //create a switch here for Score increments
    if (Player2 == Score.LOVE){
      Player2 = Score.FIFTEEN;
    } else if (Player2 == Score.FIFTEEN){
      Player2 = Score.THIRTY;
    } else if (Player2 == Score.THIRTY){
      Player2 = Score.FORTY;
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

  public Score getPlayer2Score() {
    return Player2;
  }
}