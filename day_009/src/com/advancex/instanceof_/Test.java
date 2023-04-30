package com.advancex.instanceof_;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        method(animal);
        animal = new Cat();
        method(animal);
    }

    public static void method(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchfish();
        }
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchdoor();
        }
    }
}