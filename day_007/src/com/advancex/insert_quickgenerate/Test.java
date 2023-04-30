package com.advancex.insert_quickgenerate;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "郝学生";

        Student.classRoom = 111;

        student.getName();
        student.getClassRoom();
        student.study();
    }
}