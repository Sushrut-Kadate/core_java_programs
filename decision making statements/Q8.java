import java.util.Scanner;
class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int yr = sc.nextInt();
		
		if(yr % 4==0)
		{
			if(yr % 100 ==0)
			{
				if(yr % 400 ==0)
				{
					System.out.println("Leap Year");
				}
				else
				{
				System.out.println("Not leap year");
				}
			}
			else
			{
				System.out.println("leap year");
			}
		}
		else
		{
			System.out.println("Not leap year");
		}
	}
}