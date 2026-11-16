import java.util.Scanner;
class Q3
{
	public static void main(String x[])
	{
		int a[] = {11,20,33,42,55,60};
		
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] % 2 == 0)
			{
				System.out.println("Even value :");
			System.out.printf("index -> %d , value -> %d\n",i,a[i]);
			}
			else
			{
			System.out.println("Odd value :");
			System.out.printf("index -> %d , value -> %d\n",i,a[i]);
			}
		}
	}
}