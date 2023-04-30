package com.advancex.arr_swap;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student p1 = new Student("诸葛亮",1000);
        Student p2 = new Student("刘备", 800);
        Student p3 = new Student("关羽", 900);
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j].getAge()>arr[j+1].getAge()){
                    Student temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName()+"——"+arr[i].getAge());
        }
    }
}
