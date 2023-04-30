package com.advancex.casual_coding;

public class null_pointer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[0]);

        arr = null;
        System.out.println(arr[0]);
        /*Exception in thread "main" java.lang.NullPointerException
        at com.advancex.casual_coding.null_pointer.main(null_pointer.java:8)*/
    }
}