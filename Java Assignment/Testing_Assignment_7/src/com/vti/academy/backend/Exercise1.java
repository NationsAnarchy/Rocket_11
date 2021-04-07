package com.vti.academy.backend;

import com.vti.academy.entity.MyMath;
import com.vti.academy.entity.PrimaryStudent;
import com.vti.academy.entity.SecondaryStudent;
import com.vti.academy.entity.Student;

public class Exercise1 {

    private Student[] students;

    // Question 1:
    public void question1() throws Exception {
        Student student1 = new Student(1, "Charles Leclerc");
        Student student2 = new Student(2, "Lando Norris");
        Student student3 = new Student(3, "George Russell");

        for (Student student : students) {
            System.out.println(student);
        }

        Student.college = "HV Bưu Chính Viễn Thông";

        for (Student student : students) {
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
        for (Student student : students) {
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

    // Question 4:

    public void question4() {
        Student.changeCollege("ĐH Ngoại Ngữ");
        System.out.println("After using changeCollege method: ");
        for (Student student : students) {
            System.out.println(Student.getCollege());
        }
    }

    // Question 5:

    public void question5() {
        System.out.println("Số sinh viên được tạo: ");
        System.out.println(Student.count);
    }

    // Question 6:

    public void question6() throws Exception {
        Student student4 = new PrimaryStudent("Yuki Tsunoda");
        Student student5 = new PrimaryStudent("Mick Schumacher");
        Student student6 = new SecondaryStudent("Pierre Gasly");
        Student student7 = new SecondaryStudent("Esteban Ocon");

        System.out.println("Student count: " + Student.count);
        System.out.println("Primary student count: " + PrimaryStudent.counterPrimary);
        System.out.println("Secondary student count: " + SecondaryStudent.counterSecondary);
    }
}
