package com.vti.academy.entity;

public class Exercise2 {
    // Question 2:
    public static class Student {
        private int id;
        private String name;
        private static int count = 0;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        /**
         * @deprecated replace by {@link #getIdV2()}
         *
         */
        @Deprecated
        public int getId() {
            return id;
        }

        public String getIdV2() {
            return "Student ID: " + id;
        }

        public String getName() {
            return name;
        }
    }
}
