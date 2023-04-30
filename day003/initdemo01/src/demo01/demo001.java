package demo01;

import java.util.Scanner;

public class demo001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Please type in a integer as data1:");
        int data1 = sc.nextInt();
        System.out.println("data1 = " + data1);
        System.out.println("Please type in a integer as data2:");
        int data2 = sc.nextInt();
        System.out.println("data2 = " + data2);
        System.out.println("Please type in a integer as data3:");
        int data3 = sc.nextInt();
        System.out.println("data3 = " + data3);

        int temp = data1 > data2 ? data1 : data2;
        int max = temp > data3 ? temp : data3;
        System.out.println("max = " + max);
    }
}
