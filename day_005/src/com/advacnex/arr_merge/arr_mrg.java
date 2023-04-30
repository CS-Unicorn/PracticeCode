package com.advacnex.arr_merge;

public class arr_mrg {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4};

        int[] arr_new = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr_new[i] = arr1[i];
        }

        for (int i = 0; i < arr_new.length; i++) {
            System.out.print(arr_new[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            arr_new[arr1.length + i] = arr2[i];
        }

        for (int i = 0; i < arr_new.length; i++) {
            System.out.print(arr_new[i] + " ");
        }
    }
}
