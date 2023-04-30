package com.advancex.final_abstract_;

public class Animal {

//    final String name = "王杰";

    final String name;

    public Animal() {
        this.name = "王杰"; // 虽然可以，但是一般不这样写
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("动物要吃饭");
    }
}