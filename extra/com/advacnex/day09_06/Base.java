package com.advacnex.day09_06;

public class Base {
    Base() {
        method(100);
    }

    {
        System.out.println("base");
    }

    public void method(int i) {
        System.out.println("base : " + i);
    }
}