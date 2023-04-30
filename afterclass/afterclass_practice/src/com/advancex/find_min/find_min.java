package com.advancex.find_min;

public class find_min {
    public static void main(String[] args) {
        double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};
        double min_temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min_temp > arr[i]) {
                min_temp = arr[i];
            }
        }
        double min = min_temp;
        System.out.println("max = " + min);
    }
}
