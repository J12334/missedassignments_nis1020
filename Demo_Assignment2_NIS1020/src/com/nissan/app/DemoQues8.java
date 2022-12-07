package com.nissan.app;

import java.util.Scanner;

public class DemoQues8 {
	
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

			Box box1 = new Box(widthOfBox1, heightOfBox1, depthOfBox1);
			Box box2 = new Box(widthOfBox2, heightOfBox2, depthOfBox2);

			System.out.println("Volume of Box 1: " + box1.getVolume());
			System.out.println("Volume of Box 2: " + box2.getVolume());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

