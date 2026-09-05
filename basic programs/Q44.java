class Q44
{
	public static void main(String x[])
	{
		double basicSalary = 18000;
		
		double hra = 0.5 * basicSalary;
		System.out.println("HRA :"+hra);
		
		double da = 0.25 * basicSalary;
		System.out.println("DA :"+da);
		
		double grossSalary = basicSalary + hra + da;
		System.out.println(grossSalary);
	}
}