package com.nissan.app;

import java.util.Scanner;

public class Verify {
	private static final int USER_PIN = 7251;
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter your PIN: ");
			int inputPin = sc.nextInt();
			
			if(verifyPin(inputPin)) {
				System.out.println("Correct PIN!!!");
			} else {
				System.out.println("Booo!!!! Wrong PIN!!!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static boolean verifyPin(int pin) {
		return USER_PIN == pin;
	}
}
