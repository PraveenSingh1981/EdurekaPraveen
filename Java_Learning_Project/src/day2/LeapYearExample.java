package day2;

import java.util.Scanner;

public class LeapYearExample {

	public static void main(String[] args) {
		
		//if a year is century year -- year must be divisible by 400
		// if a year is non-century --year must be divisible by 4

		int year;
		
		System.out.println("Enter the value");
		
		Scanner sc = new Scanner (System.in);
		
		year = sc.nextInt();
			
		if ((year % 100==0) && (year % 4 ==0))
		{
			System.out.println(year + " Year is a Century Leapyear");
			
		}
		
		else if ((year % 4 == 0))
		{
			System.out.println(year + " Year is a Leapyear");
		}
		
		else 
			
		{
			System.out.println(year + " Year is NOT a Leapyear");
		}
		
		sc.close ();
	}

}
