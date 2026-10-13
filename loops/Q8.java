import java.util.Scanner;
class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num :");
		int n = sc.nextInt();
		int i = 1; int sum = 0;
		
		while(i <= n)
		{
			if(i % 2 !=0)
			{
			sum += i;
			i += 2;
			}
		}	
			System.out.println("sum :"+sum);
	}
}