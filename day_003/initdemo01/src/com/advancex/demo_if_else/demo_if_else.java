package com.advancex.demo_if_else;

import java.util.Scanner;

public class demo_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的成绩: ");
        int score = sc.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("无效成绩!");
        } else {
            if (score >= 90) {
                System.out.println("奖励笔记本电脑一部");
            } else if (score >= 80 && score < 90) {
                System.out.println("奖励手机一部");
            } else {
                System.out.println("给你邦邦两拳!");
            }
        }
    }
}
