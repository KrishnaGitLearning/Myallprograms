package test;

import java.util.Scanner;

public class ScannerLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String username;
		int salary;
		
		System.out.println("Enter the user name : ");
		username = sc.nextLine();
		
		System.out.println("Enter the Salary : ");
		salary = sc.nextInt();
		
		System.out.println(username);
		System.out.println(salary);
		
	}

}
