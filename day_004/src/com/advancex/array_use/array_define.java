package com.advancex.array_use;

public class array_define {
    public static void main(String[] args) {
        int[] arr_int = new int[3];
        String[] arr_string = new String[3];
        String arr_name[] = {"张三", "李四", "王五"};
        for (int i = 0; i < arr_int.length; i++) {
            System.out.print(arr_name[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr_string.length; i++) {
            System.out.print(arr_string[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr_int.length; i++) {
            System.out.print(arr_int[i] + " ");
        }
    }
}