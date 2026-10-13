import java.util.Scanner;
class Q6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.println("enter the number :");
		int n = sc.nextInt();
		int sum = 0;
		while(i <= n)
		{
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}