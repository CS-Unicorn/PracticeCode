package com.advancex.static_internalclass;

public class Person {

    public void eat() {
        System.out.println("吃饭");
    }

    static class Heart {
        public void beat() {
            System.out.println("心在跳");
            new Person().eat();
        }
    }
}
