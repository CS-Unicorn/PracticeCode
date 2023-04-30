package com.advancex.super_use;

public class Son extends Father {
    int num = 10;

    public Son() {
        System.out.println("Son中的无参构造");
    }

    public Son(int num) {
        super(num);
        System.out.println("Son中的有参构造");
    }

    @Override
    public void method() {
        System.out.println("Son中的成员变量 " + num);
        System.out.println("父类中的成员变量 " + super.num);
    }
}