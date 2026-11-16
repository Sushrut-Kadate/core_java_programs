import java.util.Scanner;
class Q2
{
	public static void main(String x[])
	{
		int a[] = {2,4,6,8,10};
		int sum = 0;
		
		for(int i=0 ; i<a.length ; i++)
		{
			sum = a[i] + sum;
		}
		System.out.printf("sum : %d",sum);
	}
}