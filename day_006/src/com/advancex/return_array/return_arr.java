package com.advancex.return_array;

public class return_arr {
    public static void main(String[] args) {
        int[] arr = returnArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] returnArray() {
        int[] arr = {1, 2, 3, 4, 5};
        return arr;
    }
}
