package com.advancex.class_as_return_and_anonymous_class;

public class Test2 {

    public static void main(String[] args) {

        // 匿名内部类作为实参 进行 参数传递
        // 形如匿名对象
        method(new USB() {
            @Override
            public void open() {
                System.out.println("鼠标开启");
            }
        });
    }

    public static void method(USB usb) {
        usb.open();
    }
}