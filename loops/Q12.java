import java.util.Scanner;
class Q12 
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		
		int product  = 1;
		while (n > 0)
		{
			int lastDigit = n % 10;
			product = product * lastDigit;
			n = n / 10;
		}
		System.out.println("product of digits "+product);
	}
}