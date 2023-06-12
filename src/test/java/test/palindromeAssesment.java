package test;

import java.util.Scanner;

public class palindromeAssesment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		  
		  int num = sc.nextInt();
		  int rev = 0;
		  int backUp = num;
		  
		  while(num >0){
		    rev = rev*10 + num %10;
			num = num/10;
		  }  
		  System.out.println(num);
		  System.out.println(rev);
		  
		  if (backUp==rev){
		  System.out.println("Palindrome");
		  }
		  else{
		    System.out.println("Not a Palindrome");
		  } 
		  
		  
		  

	}

}
