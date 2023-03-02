package edu.pdx.cs410J.mobbing;

import com.google.common.annotations.VisibleForTesting;

public class Tennis {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  enum Score {
    LOVE;
  }

  public Score getPlayer1Score() {
    return Score.LOVE;
  }
}