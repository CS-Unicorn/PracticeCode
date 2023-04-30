package com.advancex.interface_;

public interface USB {

    public abstract void open();

    public abstract void close();

    public static final int NUM = 1; // 用final修饰的变量不能二次赋值
    int NUM1 = 10;
}