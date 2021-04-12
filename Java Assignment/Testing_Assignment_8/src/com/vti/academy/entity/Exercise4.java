package com.vti.academy.entity;

import java.util.Comparator;

public class Exercise4 {
    public class MyNumber<N extends Number> implements Comparator<N> {

        private N number;

        public MyNumber(N number) {
            this.number = number;
        }

        @Override
        public int compare(N o1, N o2) {
            return 0;
        }
    }
}
