import java.util.Scanner;
class Q23
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		
		boolean flag = false;
		while(n != 0)
		{
			int lastDigit = n % 10;
			n = n /10;
			if(lastDigit == 0)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Duck number");
		}
		else
		{
			System.out.println("Not Duck number");
		}
	}
}