import java.util.Scanner;
class Q13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int s = sc.nextInt();
		
		int a[] = new int[s];
		for(int i=0 ; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("non zero elements");
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] != 0)
			{
				System.out.printf("index = %d ,  value = %d\n",i,a[i]);
			}
		}
	}
}