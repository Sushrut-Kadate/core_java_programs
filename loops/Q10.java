import java.util.Scanner;
class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num :");
		int n = sc.nextInt();
		int count = 0;
		
		while(n > 0)
		{
			n = n / 10;
			count ++;
		}
		System.out.println("no of digits :"+count);
	}
}