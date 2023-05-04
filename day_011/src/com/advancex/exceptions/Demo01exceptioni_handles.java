package com.advancex.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.server.ExportException;

public class Demo01exceptioni_handles {
    public static void main(String[] args) throws Exception {
        String s = "advance.java";
//        String s = "advance.jav";
        method(s);

        System.out.println("method之后的语句");
    }

    public static void method(String s) throws Exception {
        if (s == null) {
            throw new IOException();
        }

        if (!s.endsWith(".java")) {
            throw new FileNotFoundException();
        }
    }
}