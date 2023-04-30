package com.advacnex.day09_06;

public class Sub extends Base {
    Sub() {
        super.method(70);
    }

    {
        System.out.println("sub");
    }

    public void method(int j) {
        System.out.println("sub : " + j);
    }
}
