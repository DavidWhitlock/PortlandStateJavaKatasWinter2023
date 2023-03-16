package edu.pdx.cs410J.room1;

import com.google.common.annotations.VisibleForTesting;

public class MinesweeperRoom1 {

  int m;
  int n;

  MinesweeperRoom1(int m, int n){
    this.m = m;
    this.n = n;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public void getMatrix() {
    int[][] matrix = new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        matrix[i][j] = 0;
      }
    }
  }
}