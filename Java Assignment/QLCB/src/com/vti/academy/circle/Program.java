package com.vti.academy.circle;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Circle circle1 = new Circle();
		
		System.out.print("Nhập vào bán kính của hình tròn: ");
		double radius = scanner.nextDouble();
		scanner.nextLine();
		circle1.setRadius(radius);
		
		System.out.print("Nhập vào màu sắc của hình tròn: ");
		String color = scanner.nextLine();
		circle1.setColor(color);
		scanner.close();
		
		System.out.println("Tính diện tích hình tròn với bán kính đã nhập ở trên");
		System.out.println("----------------------------------------------------");
		System.out.println("Bán kính: " + circle1.getRadius());
		System.out.println("Màu sắc: " + circle1.getColor());
		System.out.println("Diện tích: " + Math.ceil(circle1.getArea() * 100) / 100);
	}
}
