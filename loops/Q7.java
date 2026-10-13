import java.util.Scanner;
class Q7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = sc.nextInt();
		int sum = 0; int i = 2;
		while(i <=n )
		{
			if(i % 2 == 0)
			{
				sum += i;
				i += 2;
			}
		}
			System.out.println("sum is : "+sum);
	}
}