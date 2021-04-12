package com.vti.academy.frontend;

import com.vti.academy.entity.InnerClassEx;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        // Question 1:
        @SuppressWarnings("depreciation")
        Date date = new Date(2020, 5, 18);
        System.out.println(date);

        // Inner class:
        InnerClassEx example1 = new InnerClassEx();
    }
}
