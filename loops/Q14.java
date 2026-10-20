import java.util.Scanner;
class  Q14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		while(n !=0)
		{
			int lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n = n /10;
		}
		if(temp == rev)
		{
		System.out.println("Palindrome");
		}
		else
		{
		System.out.println("Not Palindrome");
		}
	}
}