package com.nissan.app;

import java.util.Scanner;

public class DemoQues1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// prompting user for type of electricity
			System.out.println("Enter your electricity reading: ");
			float reading = sc.nextFloat();
			System.out.println("Enter the type of electricity you use");
			System.out.println("Press 1 for Domestic usage");
			System.out.println("Press 2 for Industrial usage");

			int choice = sc.nextInt();
			double electricityBillAmount = 0;
			switch (choice) {
			case 1:
				electricityBillAmount = domesticElectricityUsage(reading);
				break;
			case 2:
				electricityBillAmount = industrialElectricityUsage(reading);
				break;
			default:
				System.out.println("Not a valid choice");
				break;
			}

			System.out.println("Your bill for using " + reading + "units is: "
					+ electricityBillAmount + "INR");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// method to calculate industrial electricity bill
	static double industrialElectricityUsage(float consumption) {
		return consumption * 10;
	}

	// method to calculate industrial electricity bill
	static double domesticElectricityUsage(float consumption) {
		double billAmount = 0;
		if (consumption == 0) {
			return billAmount;
		}
		if (consumption > 500) {

			billAmount = billAmount + (consumption - 500) * 5;
			consumption = 500;
		}
		if (consumption > 200 && consumption <= 500) {
			billAmount = billAmount + (consumption - 200) * 2;
			consumption = 200;
		}
		if (consumption > 100 && consumption <= 200) {
			billAmount = billAmount + (consumption - 100) * 1.5;
			consumption = 100;
		}
		if (consumption <= 100) {
			billAmount = billAmount + consumption;
		}

		return billAmount;
	}
}
