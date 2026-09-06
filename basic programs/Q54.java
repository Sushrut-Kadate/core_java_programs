class Q54
{
	public static void main(String x[])
	{
		double basicSalary = 35000;
		double taxAmount = 0.12 * basicSalary;
		
		double netSalary = basicSalary - taxAmount;
		System.out.printf("Net Salary %.2f",netSalary);
	}
}