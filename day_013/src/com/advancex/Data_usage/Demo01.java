package com.advancex.Data_usage;

import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date);
        System.out.println("date.getTime() = " + date.getTime());
        date.setTime(date.getTime());
        System.out.println("date = " + date);
        Date date1 = new Date(1000L);
        System.out.println("date1 = " + date1);
    }
}
