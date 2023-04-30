package com.advancex.abstract_;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println(getName()+"猫吃鱼");
    }

    @Override
    public void drink() {
        System.out.println(getName()+"猫喝水");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+"猫打盹");
    }
}
