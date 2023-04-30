package com.advancex.constructor;

public class Person1 {
    String name;
    int age;



    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getName() {
        System.out.println("姓名：" + name);
    }

    public void getAge() {
        System.out.println("年龄：" + age);
    }
}
