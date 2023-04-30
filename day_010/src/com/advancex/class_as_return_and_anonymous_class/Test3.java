package com.advancex.class_as_return_and_anonymous_class;

public class Test3 {
    public static void main(String[] args) {
        USB usb = method(); // 多态形式
        usb.open(); // 调用必然调用重写的方法
    }

    // 匿名内部类作为方法的返回值
    public static USB method() {
        return new USB() {
            // 相当于new了一个USB的实现类
            @Override
            public void open() {
                System.out.println("打开USB");
            }
        };
    }
}