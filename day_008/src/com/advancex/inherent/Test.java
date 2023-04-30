package com.advancex.inherent;

public class Test {
    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();

        System.out.println("father.num = " + father.num);
        father.method();
        System.out.println("===========================");
        System.out.println("son.num = " + son.num);
        son.method();
    }
}