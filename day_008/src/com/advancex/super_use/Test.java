package com.advancex.super_use;

public class Test {
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println("father.num = " + father.num);
        System.out.println("=====================");
        new Son().method();
    }
}