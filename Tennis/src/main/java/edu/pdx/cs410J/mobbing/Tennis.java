package edu.pdx.cs410J.mobbing;

import com.google.common.annotations.VisibleForTesting;

public class Tennis {
  Score Player1;
  Score Player2;

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public void getIncrementPlayer1Score() {
    //create a switch here for Score increments
  }

  enum Score {
    LOVE,
    FIFTEEN,
    THIRTY,
    FORTY
  }

  public Score getPlayer1Score() {
    return Score.LOVE;
  }
}