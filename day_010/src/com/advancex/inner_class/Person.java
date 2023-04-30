package com.advancex.inner_class;

public class Person {
    public void method() {

        class Heart {
            public void beat() {
                System.out.println("心在跳");
            }
        }

        new Heart().beat();
    }
}