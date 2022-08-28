package com.asharab;

import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 7;
        for(int i =0;i<arr.length;i++){
            for (int j = 0 ; j<arr.length;j++){
                if(arr[i][j]==target){
                    int[] ans = {i,j};
                    System.out.println(Arrays.toString(ans));
                }

            }
        }
        System.out.println("target not found");
    }
}
