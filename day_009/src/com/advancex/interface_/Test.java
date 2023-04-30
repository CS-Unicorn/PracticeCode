package com.advancex.interface_;

public class Test {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.open();
        mouse.close();
        System.out.println("USB.NUM = " + USB.NUM);
        System.out.println("USB.NUM1 = " + USB.NUM1);
    }
}