package com.vti.academy.entity;

import java.util.Scanner;

public class Staff extends Person {
	private int level;
	private Scanner scanner;
	
	public Staff() {
		scanner = new Scanner(System.in);
		initInput();
	}
	
	public Staff(String name, int age, boolean gender ,int level) {
		super();
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}

	@Override
	public void initInput() {
		super.initInput();
		System.out.println("Mời bạn nhập vào số bậc: ");
		level = scanner.nextInt();
	}
}
