package com.advancex.non_static_internalclass;

public class Test {
    public static void main(String[] args) {
        Person.Heart heart = new Person().new Heart();
        heart.beat();
    }
}