package com.vti.academy.entity;

import java.util.Scanner;

public class Engineer extends Person{
	private String major;
	private Scanner scanner;
	
	public Engineer() {
		scanner = new Scanner(System.in);
		initInput();
	}
	
	public Engineer(String name, int age, boolean gender, String major) {
		super(name, age, gender);
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	@Override
	public void initInput() {
		super.initInput();
		System.out.println("Mời bạn nhập vào số ngành: ");
		major = scanner.nextLine();
	}
}
