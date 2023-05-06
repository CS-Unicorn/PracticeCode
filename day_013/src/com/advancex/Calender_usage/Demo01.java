package com.advancex.Calender_usage;

import java.util.Calendar;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("calendar.get(Calendar.YEAR) = " + calendar.get(Calendar.YEAR));

        calendar.set(Calendar.YEAR, 1998);

        System.out.println("calendar.get(Calendar.YEAR) = " + calendar.get(Calendar.YEAR));

        Date time = calendar.getTime();
        System.out.println("time = " + time);
    }
}