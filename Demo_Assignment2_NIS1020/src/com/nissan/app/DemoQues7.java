package com.nissan.app;

import java.util.Scanner;

public class DemoQues7 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter width x height x depth of Box 1");
			int widthOfBox1 = sc.nextInt();
			int heightOfBox1 = sc.nextInt();
			int depthOfBox1 = sc.nextInt();

			System.out.println("Enter width x height x depth of Box 2");
			int widthOfBox2 = sc.nextInt();
			int heightOfBox2 = sc.nextInt();
			int depthOfBox2 = sc.nextInt();

			Box box1 = new Box();
			Box box2 = new Box();

			System.out.println("Volume of Box 1: "
					+ box1.getVolume(widthOfBox1, heightOfBox1, depthOfBox1));
			System.out.println("Volume of Box 2: "
					+ box2.getVolume(widthOfBox2, heightOfBox2, depthOfBox2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

 class Box {
	private float width;
	private float height;
	private float depth;

	public Box() {
		System.out.println("Inside Box constructor");
	}

	public Box(float width, float height, float depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public double getVolume() {
		return width * height * depth;
	}

	public double getVolume(float width, float height, float depth) {
		return width * height * depth;
	}
}
