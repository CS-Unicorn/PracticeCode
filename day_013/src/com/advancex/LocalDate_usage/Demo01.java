package com.advancex.LocalDate_usage;

import java.time.LocalDate;

public class Demo01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        LocalDate localDate1 = localDate.withYear(3000).withMonth(12).withDayOfMonth(10);
        System.out.println("localDate1 = " + localDate1);

        LocalDate localDate2 = localDate.plusYears(1);
        System.out.println("localDate2 = " + localDate2);

        LocalDate localDate3 = localDate.minusYears(1);
        System.out.println("localDate3 = " + localDate3);
    }
}