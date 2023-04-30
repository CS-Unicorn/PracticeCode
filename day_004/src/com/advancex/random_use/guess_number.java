package com.advancex.random_use;

import java.util.Random;
import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int rdNum = rd.nextInt(100) + 1;
        System.out.println("===========");
        System.out.println("\t 猜数字游戏");
        System.out.println("===========");
        while (true) {
            System.out.println("请猜一个数字(1-100之间)");
            int guessNum = sc.nextInt();
            if (guessNum > rdNum) {
                System.out.println("猜大了");
            } else if (guessNum < rdNum) {
                System.out.println("猜小了");
            } else if (guessNum == rdNum) {
                System.out.println("猜中了");
                break;
            }
        }
    }
}