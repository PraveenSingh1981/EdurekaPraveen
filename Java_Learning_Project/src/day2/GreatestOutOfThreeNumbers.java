package day2;

public class GreatestOutOfThreeNumbers {

	public static void main(String[] args) {

		int firstnum, secondnum, thirdnum;

		firstnum = 100;
		secondnum = 100;
		thirdnum = 100;

		if ((firstnum > secondnum) && (firstnum > thirdnum)) 
		{
			System.out.println("First Number is the greatest");
		}

		else if ((secondnum > firstnum) && (secondnum > thirdnum)) 
		{

			System.out.println("Second Number is the greatest");
		}

		else if ((thirdnum > firstnum) && (thirdnum > secondnum)) 
		{

			System.out.println("Third Number is the greatest");
		}
		
		else if ((firstnum==secondnum) && (firstnum>thirdnum))
		{
			System.out.println("First and second are greater than third");
		}

		else if ((firstnum==thirdnum) && (firstnum>secondnum))
		{
			System.out.println("First and third are greater than second");
		}
			
		else if ((secondnum==thirdnum) && (secondnum>firstnum))
		{
			System.out.println("second and third are greater than first");
		}
					
		else 
		{
			System.out.println("All are equal");
		}

	}

}
