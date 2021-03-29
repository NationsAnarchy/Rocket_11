package com.vti.academy.entity;

import java.util.Scanner;

public class Person {
	protected String name;
	protected int age;
	protected boolean gender;
	private Scanner scanner;

	public Person() {

	}

	public Person(String name, int age, boolean gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		scanner = new Scanner(System.in);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isGender() {
		return gender;
	}

	public void initInput() {
		scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên: ");
		name = scanner.nextLine();
		System.out.println("Mời bạn nhập vào tuổi: ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Mời bạn nhập vào giới tính (nam/nu): ");
		String inputGender = scanner.nextLine();
		gender = inputGender.equals("nam") ? true : false;
	}
	
	public void getInfo() {
		System.out.println("Họ và tên: " + name);
		System.out.println("Tuổi: " + age);
		System.out.println("Giới tính: " + gender);
	}
}
