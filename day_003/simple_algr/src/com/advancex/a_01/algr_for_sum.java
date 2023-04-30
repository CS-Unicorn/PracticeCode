package com.advancex.a_01;

public class algr_for_sum {
    public static void main(String[] args) {
        int sum0 = 0;
        for (int i = 1; i < +100; i++) {
            if (i % 2 != 0) {
                sum0 += i;
            }
        }
        System.out.println("sum = " + sum0);
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum1 += i;
            }
        }
        System.out.println("sum1 = " + sum1);
    }
}