package com.advancex.casual_coding;

public class find_max_in_array {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 67, 3, 6, 8};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("max = " + max);
    }
}
