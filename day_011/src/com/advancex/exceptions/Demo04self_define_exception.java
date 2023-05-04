package com.advancex.exceptions;

import java.util.Scanner;

public class Demo04self_define_exception {
    public static void main(String[] args) throws UserLoginException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String username = scanner.next();
        String name = "advancex";
        if (username.equals(name)) {
            System.out.println("Login Successfully!");
        } else {
            throw new UserLoginException("Login Failed!");
        }
    }
}