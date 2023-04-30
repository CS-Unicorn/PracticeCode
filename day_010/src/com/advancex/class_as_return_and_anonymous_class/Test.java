package com.advancex.class_as_return_and_anonymous_class;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        method(cat);

        Animal animal = method2();
        animal.eat();

        Cat cat1 = method3();
        cat1.eat();
    }

    public static void method(Animal animal) {
        animal.eat();
    }

    public static Animal method2() {
        Cat cat = new Cat();
        return cat;
    }

    public static Cat method3() {
        Cat cat = new Cat();
        return cat;
    }
}