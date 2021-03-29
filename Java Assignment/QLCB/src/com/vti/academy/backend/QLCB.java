package com.vti.academy.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.academy.entity.*;

public class QLCB {
	private List<Person> people;
	private Scanner scanner;
	
	public QLCB() {
		people = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	
	public void addPerson() {
		System.out.println("Bạn hãy cho biết loại cán bộ muốn thêm: ");
		System.out.println("1. Công nhân \n2. Kỹ sư \n3. Nhân viên");
		int select = scanner.nextInt();
		scanner.nextLine();
		switch (select) {
		case 1:
			Worker w = new Worker();
			people.add(w);
			System.out.println("Thêm mới công nhân thành công!");
			break;
		case 2:
			Engineer e = new Engineer();
			people.add(e);
			System.out.println("Thêm mới kỹ sư thành công!");
			break;
		case 3:
			Staff s = new Staff();
			people.add(s);
			System.out.println("Thêm mới nhân viên thành công!");
			break;
		default:
			break;
		}
	}
	
	public void searchByName() {
		String searchName;
		System.out.println("Bạn hãy nhập vào tên cán bộ muốn tìm: ");
		searchName = scanner.nextLine();
		for (Person person: people) {
			if (searchName.equals(person.getName())) {
				person.getInfo();
			}
		}
	}
	
	public void showInfo() {
		for (Person person : people) {
			person.getInfo();
		}
	}
	
	public void deletePerson() {
		String searchName; 
		System.out.println("Nhập vào tên nhân viên cần xoá: ");
		searchName = scanner.nextLine();
		people.removeIf(person -> searchName.equals(person.getName()));
	}
}
