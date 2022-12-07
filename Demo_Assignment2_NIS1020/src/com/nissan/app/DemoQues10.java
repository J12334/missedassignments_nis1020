package com.nissan.app;

import java.util.Scanner;

public class DemoQues10 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number: ");
			int monthNumber = sc.nextInt();
		
			if(monthNumber > 0 && monthNumber <= 12) {
				System.out.println(findMonth(monthNumber));
			} else {
				System.out.println("Not a valid month number");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static String findMonth(int monthNum) {
		String[] month = {"", "January", "February", "March", "April", "May", "June", "July", "August", "Spetember", "October", "November", "December"};
		return month[monthNum];
	}
}
