package com.advancex.interface_;

public class Mouse implements USB {

    @Override
    public void open() {
        System.out.println("开启");
    }

    @Override
    public void close() {
        System.out.println("关闭");
    }
}