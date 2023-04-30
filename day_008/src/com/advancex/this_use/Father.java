package com.advancex.this_use;

public class Father {
    int num = 100;

    public Father(){
        this(10);
        System.out.println("Father无参构造");
    }

    public Father(int i){
        System.out.println("Father有参构造");
    }
    public void method(int num){
        System.out.println("num = " + num);
        System.out.println("this.num = " + this.num);
    }
}
