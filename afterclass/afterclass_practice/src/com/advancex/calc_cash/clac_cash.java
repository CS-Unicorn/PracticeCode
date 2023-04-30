package com.advancex.calc_cash;

public class clac_cash {
    public static void main(String[] args) {
        int redT_cash = 21;
        int GreenT_cash = 24;
        redT_cash = redT_cash * 2 + 3;
        GreenT_cash = 2 * redT_cash;
        if (redT_cash == GreenT_cash) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
