package com.advancex.stringbuilder_usage;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string:");
        String init = scanner.next();
//        String init = new String("你好世界");

        extracted(init);
    }

    private static void extracted(String init) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < init.length(); i++) {
            if (i == init.length() - 1) {
                stringBuilder.append(init.charAt(i));
            } else {
                stringBuilder.append(init.charAt(i)).append(",").append(" ");
            }
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }
}