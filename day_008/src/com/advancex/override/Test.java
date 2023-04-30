package com.advancex.override;

public class Test {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();
        oldPhone.call();
        oldPhone.message();
        oldPhone.show();

        System.out.println("========================");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.message();
        newPhone.show();
    }
}