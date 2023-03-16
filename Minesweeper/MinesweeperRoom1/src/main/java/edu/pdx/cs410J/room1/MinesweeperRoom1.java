package edu.pdx.cs410J.room1;

import com.google.common.annotations.VisibleForTesting;

import java.util.Random;

public class MinesweeperRoom1 {

  int m;
  int n;

  MinesweeperRoom1(int m, int n) {
    this.m = m;
    this.n = n;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  @VisibleForTesting
  public Character[][] getMatrix() {
    Character[][] matrix = new Character[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = '.';
      }
    }
    return matrix;
  }

  @VisibleForTesting
  public Character[][] getRandomMatrix() {
    Character[][] matrix = getMatrix();
    int k = 1 + (int) (Math.random() * m);// k is between 0 to m
    for (int bombs = 1; bombs < k; bombs++) {
      int i = (int) (Math.random() * m);
      int j = (int) (Math.random() * n);
      matrix[i][j] = '*';
    }
    return matrix;
  }
}