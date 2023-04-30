package com.advancex.abstract_;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("小白");

        cat.eat();
        cat.drink();
        cat.sleep();

        String name = cat.getName();
        System.out.println("name = " + name);

        System.out.println("===============");

        Teacher teacher = new Teacher("玉皇大帝");
        System.out.println("teacher.getName() = " + teacher.getName());
        teacher.work();
    }
}