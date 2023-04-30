package com.advancex.class_use;

public class animal {
    String species;
    String name;
    String colour;
    int age;

    public void eat(String food){
        System.out.println("吃了"+food);
    }

    public void sleep(int hour){
        System.out.println("睡了"+hour+"小时");
    }

    public void cute(String name){
        System.out.println("蹭蹭"+name);
    }
}
