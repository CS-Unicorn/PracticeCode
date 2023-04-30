package com.advancex.casual_coding;

import java.util.Random;
import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {
//        Math.random()产生[0,1)范围内的小数
        int rd_num = (int) (Math.random() * (100 - 1 + 1) + 1);
        System.out.println("猜一个数字:");
        Scanner sc = new Scanner(System.in);
        int guess_num = sc.nextInt();
        int count = 1;
        while (guess_num != rd_num) {
            if (guess_num > rd_num) {
                System.out.println("猜大了");
            } else if (guess_num < rd_num) {
                System.out.println("猜小了");
            }
            count++;
            System.out.println("猜一个数字:");
            guess_num = sc.nextInt();
        }
        System.out.println("猜中了");
        System.out.println("一共猜了" + count + "次");
    }
}