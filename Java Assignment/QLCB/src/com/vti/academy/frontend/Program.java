package com.vti.academy.frontend;

import java.util.Scanner;

import com.vti.academy.backend.QLCB;

public class Program {
	public static void main(String[] args) {
		System.out.println("Chương trình quản lý cán bộ\n---------------------------");
		
		QLCB qlcb = new QLCB();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mời bạn nhập vào chức năng muốn sử dụng:\n1. Thêm cán bộ mới vào hệ thống\n2. Tìm cán bộ theo tên\n3. Hiển thị danh sách các cán bộ hiện có\n4. Xoá cán bộ theo tên nhập vào\n5. Thoát khỏi chương trình\n---------------------------");
		
		while (true) {
			System.out.print("Mời bạn nhập vào số với chức năng tương ứng: ");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				qlcb.addPerson();
				break;
			case 2:
				qlcb.searchByName();
				break;
			case 3:
				qlcb.showInfo();
				break;
			case 4:
				qlcb.deletePerson();
				break;
			case 5:
				System.out.println("Thoát khỏi chương trình.");
				scanner.close();
				return;
			default:
				break;
			}
		}
	}
}
