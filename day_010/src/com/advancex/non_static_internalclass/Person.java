package com.advancex.non_static_internalclass;

public class Person {
    public void eat() {
        System.out.println("吃饭");
    }

    class Heart {
        public void beat() {
            System.out.println("心在跳");
            new Person().eat();
        }
    }
}
