package com.vti.academy.entity;

import java.util.Scanner;

public class Worker extends Person {
	private String job;
	private Scanner scanner;
	
	public Worker() {
		scanner = new Scanner(System.in);
		initInput();
	}
	
	public Worker(String name, int age, boolean gender, String job) {
		super(name, age, gender);
		this.job = job;
	}
	
	public String getJob() {
		return job;
	}
	
	@Override
	public void initInput() {
		super.initInput();
		System.out.println("Mời bạn nhập vào công việc: ");
		job = scanner.nextLine();
	}
}
