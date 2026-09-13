import java.util.Scanner;
class Q14
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		double basicSalary = sc.nextDouble();
		double hra; double da;
		
		if(basicSalary <=10000)
		{
			hra = 0.2 * basicSalary;
			da = 0.8 * basicSalary;
			double grossSalary = basicSalary + hra +da;
			System.out.println(grossSalary);
		}
		else if(basicSalary <=20000)
		{
			hra = 0.25 * basicSalary;
			da = 0.9 * basicSalary;
			double grossSalary = basicSalary + hra + da;
			System.out.println(grossSalary);
		}
		else
		{
			hra = 0.3 * basicSalary;
			da = 0.95 * basicSalary;
			double grossSalary = basicSalary + hra + da;
			System.out.println(grossSalary);
		}
	}
}