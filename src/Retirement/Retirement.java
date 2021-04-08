package Retirement;

import java.util.Scanner;

public class Retirement {
	public static void main(String[] args) {
		// read inputs
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much do you need for a nice retirement");
		double goal = in.nextDouble();
		
		System.out.println("How much money will you contribute every year");
		double payment = in.nextDouble();
		
		System.out.println("Please input interest Rate in %:");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		// update acount balance while goal isn't reached
		while (balance < goal) {
			// adding this year's payment and interest
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
		}
		System.out.println("You can retire in " + years + "years.");
		
	}
}

