package com.vti.academy.frontend;

import com.vti.academy.backend.MyNews;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Các chức năng hiện có bao gồm: ");
        System.out.println("1. Thêm tin tức");
        System.out.println("2. Xem tin tức");
        System.out.println("3. Xem đánh giá");
        System.out.println("4. Thoát khỏi chương trình");

        while (true) {
            System.out.print("Mời bạn nhập vào chức năng muốn sử dụng: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Chức năng 1 - Thêm tin tức");
                    MyNews.addNews();
                    break;
                case 2:
                    System.out.println("Chức năng 2 - Xem tin tức");
                    MyNews.viewListNews();
                    break;
                case 3:
                    System.out.println("Chức năng 3 - Xem đánh giá");
                    break;
                case 4:
                    System.out.println("Chức năng 4 - Thoát ra khỏi chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Nhập lại chức năng phù hợp!");
                    break;
            }
        }
    }
}
