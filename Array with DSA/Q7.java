import java.util.Scanner;
class Q7
{ 
	public static void main(String x[])
	{
		int a[] = {1,2,3,4,5};
		System.out.println("Reversed Array ");
		for(int i=(a.length-1) ; i>=0 ; i--)
		{
			System.out.printf("index -> %d , value -> %d\n",i,a[i]);
		}
	}
}