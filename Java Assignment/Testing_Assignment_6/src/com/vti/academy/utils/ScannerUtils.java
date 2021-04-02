package com.vti.academy.utils;

import java.util.Scanner;

public class ScannerUtils {
    private static Scanner scanner = new Scanner(System.in);
    // Question 7
    public static int inputInt(String message) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (Exception e) {
                System.err.println(message);
            }
        }
    }

    //Question 8
    public static float inputFloat(String message) {
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine().trim());
            } catch (Exception e) {
                System.err.println(message);
            }
        }
    }

    public static double inputDouble(String message) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (Exception e) {
                System.err.println(message);
            }
        }
    }

    public static String inputString(String message) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.err.println(message);
            }
        }
    }
}