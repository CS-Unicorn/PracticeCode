package com.advancex.interface_method;

public class Test {
    public static void main(String[] args) {
        InterfaceDemo01 i1 = new InterfaceDemo01();
        System.out.println(i1);

        System.out.println(i1.getName());
        System.out.println(i1.getAge());

        i1.setName("美杜莎");
        i1.setAge(1000);

        String name = i1.getName();
        int age = i1.getAge();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}