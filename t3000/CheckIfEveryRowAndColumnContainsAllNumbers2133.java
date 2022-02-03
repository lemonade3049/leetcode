package com.lemonade.leetcode.t3000;

@SuppressWarnings({"unused", "DuplicatedCode"})
public class CheckIfEveryRowAndColumnContainsAllNumbers2133 {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[j] = 0;
            }
            for(int j = 0; j < n; j++){
                arr[matrix[i][j] - 1] = 1;
            }
            for(int j = 0; j < n; j++){
                if(arr[j] != 1){
                    return false;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[j] = 0;
            }
            for(int j = 0; j < n; j++){
                arr[matrix[j][i] - 1] = 1;
            }
            for(int j = 0; j < n; j++){
                if(arr[j] != 1){
                    return false;
                }
            }
        }
        return true;
    }
}
