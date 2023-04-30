package com.advacnex.method;

public class demo04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = add(a, b);
        System.out.println("result = " + result);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static int add(int a, int b) {
        a += a;
        b += b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        return a + b;
    }
}