package com.advancex.casual_coding;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入斐波那契数列的元素个数:");
        int N = sc.nextInt();
        int[] dp = new int[N];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println("构造的斐波那契数列为:");
        for (int i = 0; i < N; i++) {
            System.out.print(dp[i] + " ");
        }
    }
}
