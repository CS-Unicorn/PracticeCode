package com.advancex.casual_coding;

import java.util.Scanner;

public class typein_int_0end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_in = 1;
        int positive_num = 0;
        int negative_num = 0;
        while (num_in != 0) {
            System.out.println("请输入一个整数(0表示结束):");
            num_in = sc.nextInt();
            if (num_in > 0) {
                positive_num++;
            } else if (num_in < 0) {
                negative_num++;
            }
        }
        System.out.println("negative_num = " + negative_num);
        System.out.println("positive_num = " + positive_num);
    }
}
