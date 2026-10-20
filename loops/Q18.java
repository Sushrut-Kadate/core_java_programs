import java.util.Scanner;
class Q18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		
		int last = n % 10;
		
		while(n >=10)
		{
			n = n / 10;
		}
		System.out.println("first digit "+n);
		System.out.println("last digit "+last);
		int sum = n + last;
		System.out.println("Sum is "+sum);
	}
}