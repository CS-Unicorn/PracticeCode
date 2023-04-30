package com.advancex.casual_coding;

import java.util.Scanner;

public class stu_name_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name_arr = new String[3];
        for (int i = 0; i < name_arr.length; i++) {
            name_arr[i] = sc.nextLine();
        }
        for (int i = 0; i < name_arr.length; i++) {
            System.out.println(name_arr[i]);
        }
    }
}
