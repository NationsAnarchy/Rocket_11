package com.vti.academy.frontend;

import com.vti.academy.backend.WorkerManagement;

import java.util.Scanner;

public class Program4 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Các chức năng hiện có bao gồm: ");
        System.out.println("1. Thêm cán bộ");
        System.out.println("2. Tìm theo họ tên");
        System.out.println("3. Hiển thị danh sách cán bộ");
        System.out.println("4. Xoá tên cán bộ theo tên nhập vào");
        System.out.println("5. Thoát khỏi chương trình");
        while (true) {
            System.out.print("Mời bạn nhập vào chức năng muốn sử dụng: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Chức năng 1 - Thêm cán bộ");
                    WorkerManagement.addWorker();
                    break;
                case 2:
                    System.out.println("Chức năng 2 - Tìm theo họ tên");
                    WorkerManagement.searchByName();
                    break;
                case 3:
                    System.out.println("Chức năng 3 - Hiển thị danh sách cán bộ");
                    WorkerManagement.showInformation();
                    break;
                case 4:
                    System.out.println("Chức năng 4 - Xoá tên cán bộ theo tên nhập vào");
                    WorkerManagement.deleteWorker();
                    break;
                case 5:
                    System.out.println("Thoát ra khỏi chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Nhập lại chức năng phù hợp!");
                    break;
            }
        }
    }
}
