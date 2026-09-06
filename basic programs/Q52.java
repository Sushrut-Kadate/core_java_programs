import java.util.Scanner;
class Q52
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Percentage");
		double percentage = sc.nextDouble();
		
		System.out.println("Enter Income");
		int income = sc.nextInt();
		
		String msg = (percentage > 75 && income < 20000) ? "Eligible":"Not Eligible";
		System.out.println(msg);
	}
}