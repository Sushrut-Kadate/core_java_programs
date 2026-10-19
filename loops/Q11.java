import java.util.Scanner;
class Q11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		int sum = 0;
		
		while (n > 0)
		{
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		System.out.println("sum of digits : "+sum);
	}
}