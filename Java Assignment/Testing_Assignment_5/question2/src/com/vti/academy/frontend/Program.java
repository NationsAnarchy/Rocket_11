package com.vti.academy.frontend;

import com.vti.academy.backend.TuyenSinh;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Các chức năng hiện có bao gồm: ");
        System.out.println("1. Thêm thí sinh");
        System.out.println("2. Hiển thị thông tin thí sinh");
        System.out.println("3. Tìm theo số báo danh");
        System.out.println("4. Thoát khỏi chương trình");

        while (true) {
            System.out.print("Mời bạn nhập vào chức năng muốn sử dụng: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Chức năng 1 - Thêm thí sinh");
                    TuyenSinh.addExaminee();
                    break;
                case 2:
                    System.out.println("Chức năng 2 - Hiển thị thông tin thí sinh");
                    TuyenSinh.showExaminee();
                    break;
                case 3:
                    System.out.println("Chức năng 3 - Tìm theo số báo danh");
                    TuyenSinh.findExaminee();
                    break;
                case 4:
                    System.out.println("Chức năng 4 - Thoát khỏi chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Nhập lại chức năng phù hợp!");
                    break;
            }
        }
    }
}
