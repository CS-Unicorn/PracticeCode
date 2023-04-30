package com.advancex.bubble_sort;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int[] result = bubble_sort(arr);
        System.out.println(Arrays.toString(result));
    }

    /*
        冒泡排序
        总共比较n-1圈
        每圈比较确定一个元素的最终位置
        故每次比较次数减少1
        第一圈比较次数为n-1
     */
    public static int[] bubble_sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}