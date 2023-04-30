package com.advancex.inner_class;

public class Test01 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        method(mouse);
        USB usb = method02(mouse);  // 多态
        usb.open();
    }

    public static void method(USB usb) {
        usb.open();
    }

    public static USB method02(USB usb) {
        USB usb1 = new Mouse();
        return usb1;
    }
}