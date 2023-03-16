package edu.pdx.cs410J.room1;

import com.google.common.annotations.VisibleForTesting;

import java.util.Random;

public class MinesweeperRoom1 {

  int m;
  int n;

  Character[][] matrix;

  MinesweeperRoom1(int m, int n) {
    this.m = m;
    this.n = n;
    matrix = getRandomMatrix();
  }

  public Character[][] play() {
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {

      }
    }
  }

  public void checkNeighbor(int x, int y) {
    if (matrix[x][y] == '*') {
      for(int i = x-1 ; i<x+2 ; i++){
        for(int j = y-1 ; j<y+2 ; j++){
          if(i >= 0 || i < m){
            if(j >= 0 || j < n){
              if(matrix[i][j] == '.'){
                matrix[i][j] = '1';
              }
              else{
                int temp = Integer.parseInt(matrix[i][j].toString()) +1 ;
                temp += 1;
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