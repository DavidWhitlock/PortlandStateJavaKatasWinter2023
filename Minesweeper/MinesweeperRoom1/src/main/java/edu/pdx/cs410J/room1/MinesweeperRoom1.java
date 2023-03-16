package edu.pdx.cs410J.room1;

import com.google.common.annotations.VisibleForTesting;

import java.util.Random;

public class MinesweeperRoom1 {

  int m;
  int n;

  public void getMatrix() {
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }

  Character[][] matrix;

  MinesweeperRoom1(int m, int n) {
    this.m = m;
    this.n = n;
    matrix = getRandomMatrix();
  }

  public void play() {
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        updateNeighbour(i, j);
      }
    }
  }

  public void updateNeighbour(int x, int y) {
    if (matrix[x][y] == '.') {
      matrix[x][y] = '0';
    } else if (matrix[x][y] == '*') {
      for (int i = x - 1; i < x + 2; i++) {
        for (int j = y - 1; j < y + 2; j++) {
          if (i >= 0 && i < m) {
            if (j >= 0 && j < n) {
              if (matrix[i][j] == '*') {

              } else if (matrix[i][j] == '.' || matrix[i][j] == '0') {
                matrix[i][j] = '1';
              } else {
                matrix[i][j] = String.valueOf(Integer.parseInt(String.valueOf(matrix[i][j])) + 1).charAt(0);
              }
            }
          }
        }
      }
    }
  }


  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  @VisibleForTesting
  public Character[][] getDotMatrix() {
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
    Character[][] matrix = getDotMatrix();
    int k = 1 + (int) (Math.random() * m);// k is between 0 to m
    for (int bombs = 1; bombs < k; bombs++) {
      int i = (int) (Math.random() * m);
      int j = (int) (Math.random() * n);
      matrix[i][j] = '*';
    }
    return matrix;
  }
}