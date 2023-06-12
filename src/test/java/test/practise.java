package test;

import org.testng.annotations.Test;

public class practise {

	@Test
	public void fibonacciSeries() {

		// get n value from the user and print the fibonaci series until n

		int n = 10;
		int n1 = 0;
		int n2 = 1;
		int n3;

		System.out.println("Fibonacci Series");
		for (int i = 1; i < n; i++) {

			System.out.print(n1 + " ,");

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

		}

	}

	@Test
	public void primeNumber() {

		// get n value from th user and print the all the prime numbers until n

		int num = 10;

		// int i;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {

				System.out.println("Not a Prime ");

			} else

				System.out.println("It is Prime");

		}

	}

	@Test
	public void VowelCount() {

		// get sentence from the user and print the total vowel count

	}

	@Test
	public void wordCount() {

		// get sentence from the user and print the total word count and count of each
		// words

	}

	@Test
	public void Palindrome() {

		// get sentence from the user and check for palindrome or not

	}

	@Test
	public void sortAscendingOrder() {

		// get n numbers from the user and sort in ascending order

	}

	@Test
	public void printPattern() {

		// print following pattern
		/*
		 * * ** *** ****
		 */

		int a = 5;

		for (int i = 1; i <= a; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(1);

			}

			System.out.println();

		}

	}

	@Test
	public void printPatternNumbers() {

		// print following pattern
		/*
		 * 1 1 2 1 2 3 1 2 3 4
		 */
		int a = 5;

		for (int i = 1; i <= a; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i);

			}

			System.out.println();

		}

	}

	@Test
	public void switchCaseDays() {

		// Usee switch case to print days (0 -7) (Sunday - Monday)

	}

	@Test
	public void studentGradeCalc() {

		// get the 5 subject marks from user and calculate the grade , grade can be
		// based on your own condition

	}

	@Test
	public void removeSpaceReverse() {

		// Get the sentense from the user , reverse the string reverse the character and
		// remove space

		/*
		 * Example : I Love India India Love I > Reverse the string aidnI evoL I >
		 * reverse the character in eachword aidnIevoLI> remove spaces aidnievoli>
		 * conver all to lowercase
		 * 
		 * 
		 */
	}

	@Test
	public void removeDuplicates() {

		// Get the sentence from the user , print only the unique Value

	}

	@Test
	public void calculator() {

		// get the n numbers from user
		// ask for the functionality to perform ( Add Sub Ml Div)
		// perform and show the result

	}

}
