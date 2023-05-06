package com.advancex.Calender_usage;

import java.util.Calendar;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, 2, 1);
        calendar.add(Calendar.DATE, -1);
        int day = calendar.get(Calendar.DATE);
        if (day == 29) {
            System.out.println("是润年");
        } else {
            System.out.println("是平年");
        }

        System.out.println("Please enter your birthyear:");
        int birthyear = scanner.nextInt();
        System.out.println("Please enter your birthmonth:");
        int birthmonth = scanner.nextInt();
        System.out.println("Please enter your birthday");
        int birthday = scanner.nextInt();

        calendar.set(year,birthyear);
    }
}
