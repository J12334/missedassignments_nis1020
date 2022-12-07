package com.nissan.app;

import java.util.Scanner;

public class DemoQues3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// prompting user for entering the month
			System.out.println("Enter the month in number: ");
			byte monthNumber = sc.nextByte();

			System.out.println(seasonType(monthNumber));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static String seasonType(byte monthNumber) {
		if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
			return "Winter Season!!!";
		} else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
			return "Spring Season!!!";
		} else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
			return "Summer Season!!!";
		} else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
			return "Autumn Season!!!";
		} else {
			return "It's not a valid month";
		}
	}
}
