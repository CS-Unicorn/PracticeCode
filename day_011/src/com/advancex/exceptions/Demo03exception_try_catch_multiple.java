package com.advancex.exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class Demo03exception_try_catch_multiple {
    public static void main(String[] args) {
        String s = "advance.java1";
        try {
            add(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("query");
        System.out.println("cancel");
        System.out.println("modify");

        try {
            add(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void add(String s) throws FileNotFoundException, NullPointerException {
        if (!s.endsWith(".java")) {
            throw new FileNotFoundException("文件未找到");
        }
        if (s == null) {
            throw new NullPointerException();
        }
    }
}