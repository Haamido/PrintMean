package com.company;

import java.util.Scanner;

public class PrintMean {

    public static void main(String[] args) {
        // testar detta bara.
        System.out.println("Mean of 1, 1, 3, 3: " + meanCalc(a: 1, b: 2, c:3, d:4));
        System.out.println("Mean of 1, 1, 3, 3: " +  meanCalc(a: 1, b: 2, c:3, d:4));
        System.out.println("Mean of 1, 1, 3, 3: " +  meanCalc(a: 1, b: -2, c: 3, d:-4));
        System.out.println("Mean of -1, -11, 24, 2: " +  meanCalc(a: -1, b: -11, c: 24, d:2));
    }

    public static String meanCalc(int a, int b, int c, int d) {
        int mean = (a + b + c + d) / 4;
        String meanString = "";

        return meanString;

    }
}