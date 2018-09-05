package day2;

public class Employee {
	
	int bonus;
	int salary;
	int totalsalary;
	
	void caculatesalary()
	
	{
				
		totalsalary = salary + bonus;
		
		System.out.println("Total Salary is : " + totalsalary);
	}

	int caculatesalary2()
	
	{	
		totalsalary = salary + bonus;
		return totalsalary;
	}
	
	
}
