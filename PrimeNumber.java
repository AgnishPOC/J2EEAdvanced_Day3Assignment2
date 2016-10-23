package Day3.Assignment2;

import java.util.Scanner;

public class PrimeNumber {

	// Function to check whether Num is Prime or Composite
	public boolean PrimeCheck(int num) {
		int flag = 0;
		for (int j = 2; j < num; j++) {
			if (num % j == 0)
				flag = 1;
		}
		if (flag != 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		// Input of the Number to be checked
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num = scan.nextInt();
		scan.close();

		PrimeNumber obj = new PrimeNumber();

		// Check the returned Boolean value from Function : PrimeCheck
		if (obj.PrimeCheck(num))
			System.out.println("Prime Number");
		else
			System.out.println("Composite Number");

	}

}
