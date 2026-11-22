import java.util.Scanner;
class Q19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array :");
		int s = sc.nextInt();
		
		int a[] = new int[s];
		System.out.println("enter the array elements");
		for(int i=0 ; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		boolean neg = false;
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] < 0)
			{
				neg = true;
				a[i] = 0;
			}
		}
		
		System.out.println("Updated Array");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.printf("%d ,",a[i]);
		}
	}
}