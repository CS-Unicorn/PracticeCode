package com.advacnex.guess_num_game;

import java.util.Random;
import java.util.Scanner;

public class gs_num_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int rdNum = rd.nextInt(10) + 1;
        System.out.println("猜字游戏");
        while (true) {
            System.out.println("请猜一个数字:");
            int gsNum = sc.nextInt();
            if (gsNum < rdNum) {
                System.out.println("猜小了");
            } else if (gsNum > rdNum) {
                System.out.println("猜大了");
            } else if (gsNum == rdNum) {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
