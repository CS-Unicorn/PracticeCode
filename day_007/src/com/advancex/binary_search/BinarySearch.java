package com.advancex.binary_search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int l = 0;
        int r = arr.length - 1;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("请输入一个数进行查找：");
        int key = sc.nextInt();

        int flag = 0;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (key > arr[mid]) {
                l = mid + 1;
            } else if (key < arr[mid]) {
                r = mid - 1;
            } else {
                System.out.println("index = " + mid);
                flag++;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("没找到！");
        }
    }
}
