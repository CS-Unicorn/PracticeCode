package com.advancex.abstract_;

public class Teacher extends Employee {
    public Teacher() {
    }

    public Teacher(String name) {
        super(name);
    }

    public void work() {
        System.out.println(getName() + "要工作");
    }
}