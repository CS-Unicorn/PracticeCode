package com.advancex.transfer_array;

public class transfer_arr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        transfer_arr(arr);
    }

    public static void transfer_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}