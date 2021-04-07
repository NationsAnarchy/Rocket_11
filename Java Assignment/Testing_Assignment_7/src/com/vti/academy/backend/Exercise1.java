package com.vti.academy.backend;

import com.vti.academy.entity.MyMath;
import com.vti.academy.entity.Student;

public class Exercise1 {

    private Student[] students;

    // Question 1:
    public void question1() throws Exception{
        Student student1 = new Student(1, "Charles Leclerc");
        Student student2 = new Student(2, "Lando Norris");
        Student student3 = new Student(3, "George Russell");

        for (Student student:students) {
            System.out.println(student);
        }

        Student.college = "HV Bưu Chính Viễn Thông";

        for (Student student:students) {
            System.out.println(student);
        }
    }

    // Question 2:

    public void question2() {
        System.out.println("Money before spending:");
        System.out.println(Student.getGroupMoney());

        students[0].spendMoney(50);
        System.out.println("After the first student spent the money:");
        System.out.println(Student.getGroupMoney());

        students[1].spendMoney(20);
        System.out.println("After the second student spent the money:");
        System.out.println(Student.getGroupMoney());

        students[2].spendMoney(150);
        System.out.println("After the third student spent the money:");
        System.out.println(Student.getGroupMoney());

        System.out.println("Everyone donate 50 more money, each.");
        for (Student student:students) {
            student.addMoney();
        }

        System.out.println("Final amount after spending and funding:");
        System.out.println(Student.getGroupMoney());
    }

    // Question 3:

    public void question3() {
        System.out.println(MyMath.findMax(5, 10));
        System.out.println(MyMath.findMin(5, 10));
        System.out.println(MyMath.calculateSum(5, 10));
    }


}
