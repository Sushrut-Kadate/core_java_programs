import java.util.Scanner;
class Q16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array ");
		int s = sc.nextInt();
		
		int a[] = new int[s];
		System.out.println("enter the array ");
		for(int i=0 ; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0 ; i<a.length ; i++)
		{
			sum += a[i];
		}
		
		double average = sum / a.length;
		System.out.println("Average of Array Elements : "+average);
	}
}