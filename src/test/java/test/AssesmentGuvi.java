package test;

import java.util.Scanner;

public class AssesmentGuvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double studentMarks;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the Student mark:");
		  studentMarks = sc.nextDouble();
		  
		  
		  if(studentMarks>=90 && studentMarks<=99){
			System.out.println("A");
		  }else if(studentMarks>=80 && studentMarks<=89){
		    System.out.println("B");
		  }else if(studentMarks>=70 && studentMarks<=79){
		    System.out.println("C");
		  }else if(studentMarks>=60 && studentMarks<=69){
		    System.out.println("D");
		  }else if(studentMarks>=50 && studentMarks<=59){
		    System.out.println("E");
		  }else if(studentMarks<50){
		    System.out.println("F");
		  }else if(studentMarks>=99 && studentMarks<=100){
		    System.out.println("S");
		  }else if(studentMarks>101){
		    System.out.println("Invalid Input");
		  }  

	}

}
