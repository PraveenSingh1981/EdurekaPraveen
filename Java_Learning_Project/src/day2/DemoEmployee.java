package day2;

public class DemoEmployee {

	public static void main(String[] args) {
		
		//Declaring an Object
		Employee sagar;
		
		//Instantiating and Initializing the object
		sagar = new Employee();
		
		sagar.salary = 90000;
		sagar.bonus = 30000;
		
		sagar.caculatesalary();
		
		System.out.println("-----------------------------------------------------------------");

		Employee chiku = new Employee ();
		
		chiku.salary = 60000;
		chiku.bonus = 20000;
		
		int totalsalary = chiku.caculatesalary2();
		
		System.out.println("Chiku's Total Salary : " + totalsalary);
		
	}

}
