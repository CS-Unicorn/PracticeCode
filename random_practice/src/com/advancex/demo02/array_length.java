package com.advancex.demo02;

import java.util.Random;
import java.util.Scanner;

public class array_length {
    public static void main(String[] args) {
        Random rd = new Random(77);
        int arr[] = new int[10];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100) + 1;
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0 && arr[i] % 7 != 0) {
                count++;
                System.out.println(arr[i]);
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("count = " + count);
    }
}