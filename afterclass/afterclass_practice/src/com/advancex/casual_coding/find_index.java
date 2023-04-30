package com.advancex.casual_coding;

import java.util.Scanner;

public class find_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_arr = new int[5];

        for (int i = 0; i < num_arr.length; i++) {
            num_arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num_arr.length; i++) {
            System.out.print(num_arr[i] + " ");
            if (i == num_arr.length - 1) {
                System.out.println("\n");
            }
        }

        int get_i = sc.nextInt();
        for (int i = 0; i < num_arr.length; i++) {
            if (get_i == num_arr[i]) {
                System.out.println("the index is " + i);
            }
        }
    }
}