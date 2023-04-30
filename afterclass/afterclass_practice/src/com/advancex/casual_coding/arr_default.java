package com.advancex.casual_coding;

public class arr_default {
    public static void main(String[] args) {

        System.out.println("=====================");
        System.out.println("array_default_value:");

        int[] int_arr = new int[3];
        for (int i = 0; i < int_arr.length; i++) {
            System.out.println("int_arr[" + i + "] = " + int_arr[i]);
        }

        String[] string_arr = new String[3];
        for (int i = 0; i < string_arr.length; i++) {
            System.out.println("string_arr[" + i + "] = " + string_arr[i]);
        }

        double[] double_arr = new double[3];
        for (int i = 0; i < double_arr.length; i++) {
            System.out.println("double_arr[" + i + "] = " + double_arr[i]);
        }

        char[] char_arr = new char[3];
        for (int i = 0; i < char_arr.length; i++) {
            System.out.println("char_arr[" + i + "] = " + char_arr[i]);
        }

        boolean[] boolean_arr = new boolean[3];
        for (int i = 0; i < boolean_arr.length; i++) {
            System.out.println("boolen_arr[" + i + "] = " + boolean_arr[i]);
        }
        System.out.println("=====================");
    }
}