package com.asharab;

public class Alternate {
    public static void main(String[] args) {
        int[] arr = {12,14,16,18,20};
        print(arr,5);
    }
    public static void print(int arr[], int n)
    {
        for(int i = 0; i<n; i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }

        }
    }
}
