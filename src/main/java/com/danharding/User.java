package com.danharding;

import java.util.Scanner;

public class User {

    public static String getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        return scanner.nextLine().trim();
    }
}
