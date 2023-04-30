package com.advancex.class_as_return_and_anonymous_class;


public class Test1 {
    public static void main(String[] args) {
        USB usb = method();
        usb.open();

        // 匿名内部类的使用
        // 优势：不用单独写一个实现类
        // 弊端：要是再想使用此匿名内部类，则必须再写，再new
        // 使用场景：只需要使用一次的情况
        new USB() {
            @Override
            public void open() {
                System.out.println("匿名内部类打开鼠标");
            }
        }.open();
    }

    public static USB method() {
        // 局部内部类的使用
        // 定义在方法内，方法返回内部类类型
        // 最后直接通过方法返回定义在方法中的内部类类型
        // 这样做的好处：不用单独写一个实现类
        class Mouse implements USB {
            @Override
            public void open() {
                System.out.println("鼠标开启");
            }
        }
        return new Mouse();
    }
}