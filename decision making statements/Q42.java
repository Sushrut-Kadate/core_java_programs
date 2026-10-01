import java.util.Scanner;
class Q42
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter basic salary , YOE , PR");
		int salary = sc.nextInt();
		int service = sc.nextInt();
		int pr = sc.nextInt();
		
		if(pr >= 4 && service > 5)
		{
			double newSalary = salary + (salary * 0.2);
			System.out.println("New Salary is "+newSalary);
		}
		else if(pr >=3)
		{
			double newSalary = salary + (salary * 0.10);
			System.out.println("New salary is"+newSalary);
		}
		else 
		{
			double newSalary = salary + (salary * 0.50);
			System.out.println("New Salary "+newSalary);
		}
	}
}