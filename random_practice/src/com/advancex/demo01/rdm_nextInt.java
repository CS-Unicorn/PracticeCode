package com.advancex.demo01;

import java.util.Random;
import java.util.Scanner;

public class rdm_nextInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("请输入一个数字:");
        int scNumber = sc.nextInt();
        int rdNumber = rd.nextInt(20);
        System.out.println("rdNumber = " + rdNumber);
        if (scNumber > rdNumber) {
            System.out.println("猜大了");
        } else if (scNumber < rdNumber) {
            System.out.println("猜小了");
        } else if (scNumber == rdNumber) {
            System.out.println("猜中了");
        }
    }
}
