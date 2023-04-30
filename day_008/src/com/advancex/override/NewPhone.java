package com.advancex.override;

public class NewPhone extends OldPhone {
    @Override
    public void show() {
        System.out.println("显示号码");
        System.out.println("显示归属地");
    }
}
