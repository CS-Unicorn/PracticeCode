package com.advancex.random_use;

import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        Random rd = new Random();
        int data = rd.nextInt(10);
        System.out.println("data = " + data);
        int data1 = rd.nextInt(10) + 1;
        System.out.println("data1 = " + data1);
        int data2 = rd.nextInt(100) + 1;
        System.out.println("data2 = " + data2);
        int data3 = rd.nextInt(900) + 100;
        System.out.println("data3 = " + data3);
    }
}