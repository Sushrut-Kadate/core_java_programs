import java.util.Scanner;
class Q35
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter years of service :");
		System.out.println("salary");
		int service = sc.nextInt();
		double salary = sc.nextDouble();
		
		if(service > 5)
		{
			double bonus = salary * 5/100;
			System.out.println("Bonus :"+bonus);
		}
		else
		{
			System.out.println("No bonus");
		}
	}
}