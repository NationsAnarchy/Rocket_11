package com.vti.academy.backend;

import com.vti.academy.entity.Student;

public class Exercise3 {
    public void question1(){
        Student student1 = new Student(1, "Charles Leclerc", "Monaco");
        Student student2 = new Student(2, "Lando Norris", "England");
        Student student3 = new Student(3, "Carlos Sainz Jr", "Spain");

        student1.setGrade(7.0);
        student2.setGrade(8.0);
        student3.setGrade(3.0);
        student3.addGrade(1.0);

        System.out.println(student3);
    }
}
