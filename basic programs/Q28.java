
class Q28
{
	public static void main(String x[])
	{
		double basicSalary = 20000;
		double hra = basicSalary * 0.10;
		double da = basicSalary * 0.05;
		
		double totalSalary = basicSalary + hra + da;
		double tax = basicSalary * 0.02;
		
		System.out.println("Net Salary "+ (totalSalary - tax));
	}
}