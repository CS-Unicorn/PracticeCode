package com.advancex.find_max;

public class find_max {
    public static void main(String[] args) {
        double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};
        double max_temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max_temp < arr[i]) {
                max_temp = arr[i];
            }
        }
        double max = max_temp;
        System.out.println("max = " + max);
    }
}
