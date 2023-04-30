package com.advancex.casual_coding;

public class qomolangma {
    public static void main(String[] args) {
        double qomo_height = 8848.86 * 100;
        double ppr = 0.1;
        int count = 0;
        while (qomo_height > ppr) {
            ppr *= 2;
            count++;
        }
        System.out.println("count = " + count);
    }
}
