package com.advancex.multransfer;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Cat cat = new Cat();

        Animal animal = new Dog();

        method(dog);

        method(cat);

        method(animal);
    }

    public static void method(Animal animal) {
        animal.method();
    }
}
