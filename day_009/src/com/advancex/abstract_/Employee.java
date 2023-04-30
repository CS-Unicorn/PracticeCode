package com.advancex.abstract_;

public abstract class Employee {
//    private String name;
    String name;
    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void work();
}