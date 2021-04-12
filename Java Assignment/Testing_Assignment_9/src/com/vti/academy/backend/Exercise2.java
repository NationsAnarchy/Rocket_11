package com.vti.academy.backend;

import com.vti.academy.entity.Exercise2.*;

public class Exercise2 {
    @Deprecated
    public void question2() {
        Student student = new Student(1, "Lando Norris");

        // Old getId method is deprecrated.
        System.out.println(student.getId());
        System.out.println(student.getName());

        // Method getIdV2 is used instead.
        System.out.println(student.getIdV2());
    }
}
