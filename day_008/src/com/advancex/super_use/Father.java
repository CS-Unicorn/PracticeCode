package com.advancex.super_use;

public class Father {
    int num = 100;

    public Father() {
        System.out.println("Father中的无参构造");
    }

    public Father(int num) {
        this.num = num;
        System.out.println("Father中的有参构造");
    }

    public void method() {
        System.out.println("Father中的method");
    }
}