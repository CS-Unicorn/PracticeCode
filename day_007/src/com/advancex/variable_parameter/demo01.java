package com.advancex.variable_parameter;

public class demo01 {
    public static void main(String[] args) {
        String result = concat("-", "刘备", "关羽", "张飞");
        System.out.println("result = " + result);
    }

    public static String concat(String s, String... st) {
        String str ="";
        for (int i = 0; i < st.length; i++) {
            if (i == st.length - 1) {
                str+=st[i];
            } else {
                str+=st[i]+s;
            }
        }
        return str;
    }
}