package test;

import java.util.Scanner;

public class ScannerAndArrayPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number of element to array: ");
		Scanner arr = new Scanner(System.in);
		int length = arr.nextInt();

		double[] marks = new double[length];

		for (int i = 0; i < length; i++) {
			
			
			marks[i] = arr.nextDouble();

		}

		System.out.println(marks.length);

		double total = 0;

		for (int i = 0; i < length; i++) {

			total = total + marks[i];

		}

		double avg = total / marks.length;

		System.out.println("Avg : " + avg);

	}

}
