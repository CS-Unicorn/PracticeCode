package com.advancex.class_use;

public class Test {
    public static void main(String[] args) {
        animal animal = new animal();
        animal.name = "美杜莎";
        animal.age = 6;
        animal.colour = "red";
        animal.species = "serpent";

        animal.eat("hotpot");
    }
}
