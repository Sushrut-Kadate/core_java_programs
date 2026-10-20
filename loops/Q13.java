import java.util.Scanner;
class Q13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		
		int rev = 0;
		while(n > 0)
		{
			int lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n = n / 10;
		}
		System.out.println("reverse number is : "+rev);
	}
}