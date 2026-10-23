import java.util.Scanner;
class Q21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		
		boolean flag = true;
		for(int i=2 ; i < Math.sqrt(n); i++)
		{
			if(n % i == 0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}
}