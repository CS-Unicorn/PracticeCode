package com.advancex.get_class;

public class Test {
    public static void main(String[] args) {
        Person 唐九夏 = new Person("唐九夏", 23);
        System.out.println(唐九夏.toString());
        System.out.println(唐九夏.getClass());

//        System.out.println(唐九夏.getClass() ==  唐九夏.hashCode());
    }
}