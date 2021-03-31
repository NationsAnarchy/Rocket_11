package com.vti.academy.backend;

import com.vti.academy.entity.Student;

public class StudentManagement {
    private Student[] students;

    public StudentManagement(){
        students = new Student[5];
    }

    public void newStudents(){
        students[0] = new Student(1, "Charles", 1);
        students[1] = new Student(2, "Lando", 2);
        students[2] = new Student(3, "George", 3);
        students[3] = new Student(4, "Alex", 2);
        students[4] = new Student(5, "Carlos", 1);
    }

    public void classRollUp(){
        for (int i = 1; i <= 5; i++){
            students[i].rollUp();
        }
    }

    public void learningGroup(){
        for (int i = 1; i <= 5; i++){
            if (students[i].getGroup() == 2) {
                students[i].studyInClass();
            }
        }
    }

    public void cleanUpGroup(){
        for (int i = 1; i <= 5; i++){
            if (students[i].getGroup() == 3){
                students[i].cleanUp();
            }
        }
    }
}
