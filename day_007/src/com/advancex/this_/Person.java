package com.advancex.this_;

public class Person {
    private String name;

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak(String name) {
        System.out.println(name + "你好，我是" + this.name);
    }
}