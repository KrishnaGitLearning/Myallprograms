package test;

import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//declaring the array
		//total of array
		//avg of array
		
		Scanner sc = new Scanner(System.in);
		
		int [] array = {10, 20, 30, 40, 50};
		
		System.out.println(array.length);
		
		int total = 0;
		
		
		for(int i=0; i<array.length; i++) {
			
			total = total + array[i];
			
			
		}
		
		System.out.println(total);
		
		
	}

}
