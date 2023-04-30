package com.advancex.insert_quickgenerate;

public class Student {
    String name;

    static int classRoom;

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getClassRoom() {
        System.out.println(classRoom);
        return classRoom;
    }

    public void study(){
        System.out.println("好好学习，找个好工作，找个好老婆");
    }

}
