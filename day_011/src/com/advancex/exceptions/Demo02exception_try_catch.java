package com.advancex.exceptions;

import java.io.FileNotFoundException;

public class Demo02exception_try_catch {
    public static void main(String[] args) {
        String s = "advance.java1";
        try{
            add(s);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("query");
        System.out.println("cancel");
        System.out.println("modify");
    }

     private static void add(String s) throws  FileNotFoundException{
        if(!s.endsWith(".java")){
            throw new FileNotFoundException("文件未找到");
        }
    }
}
