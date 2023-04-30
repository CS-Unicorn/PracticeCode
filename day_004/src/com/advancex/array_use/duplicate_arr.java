package com.advancex.array_use;

public class duplicate_arr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        String[] name = {"张三", "李四", "王五"};
        String[] name_dup = new String[name.length];

        for (int i = 0; i < name.length; i++) {
            name_dup[i] = name[i];
        }

        System.out.println("using name_dup.for:");
        for (String s : name_dup) {
            System.out.print(s + " ");
        }

        System.out.println();
    }
}