package com.advancex.mulmethod;

public class Son extends Father {
    String str = "子类";

    public void method() {
        System.out.println("子类中的方法");
    }

    public void mtd(){
        System.out.println("子类中的特有方式");
    }
}