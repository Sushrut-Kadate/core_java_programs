import java.util.*;
class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		for(int i=0 ; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Displaying array ");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.printf("index -> %d , value : %d\n",i,a[i]);
		}
	}
}