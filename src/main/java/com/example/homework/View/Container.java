package com.example.homework.View;

import java.util.Scanner;

public class Container {
    private static Scanner sc = new Scanner(System.in);
    public static Scanner getInstance() {
        return sc;
    }

    public static void close() {
        sc.close();
    }
}
