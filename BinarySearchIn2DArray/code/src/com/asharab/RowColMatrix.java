// let's say the matrix is sorted in a row wise and column wise manner
/* int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
    };
 */
package com.asharab;

import java.util.Arrays;

public class RowColMatrix {
    public static void main (String[] args){
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 37;
        System.out.println(Arrays.toString(binarySearch(arr,target)));
    }
    static int[] binarySearch(int[][] arr,int target){
        int row = 0;
        int col = arr.length -1;
        //base condition is when row is< the length and col>=0.
        while (row< arr.length && col >=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            } else if (arr[row][col]>target) {
                col--;
            }
            else {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
