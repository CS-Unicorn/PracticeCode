package com.advancex.mulmethod;

public class Test {
    public static void main(String[] args) {
        Father father = new Son();
        father.method();
        System.out.println("father.str = " + father.str);

        Son son = new Son();
        System.out.println("son.str = " + son.str);
        son.method();
    }
}