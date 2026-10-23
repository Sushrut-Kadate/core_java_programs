import java.util.Scanner;
class Q22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		int i = 1; int sum = 0;
		while(i < num)
		{
			if(num % i == 0)
			{
				sum = sum + i;
			}
			i++;
		}
		if(num == sum )
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not perfect number");
		}
	}
}