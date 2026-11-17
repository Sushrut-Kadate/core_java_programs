import java.util.Scanner;
class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		for(int i=0 ; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		// System.out.println("displaying array");
		// for(int i=0 ; i<a.length ; i++)
		//{
		//	System.out.printf("index i=%d , value=%d\n",i,a[i]);
		//}
		System.out.println("missing elements");
		for(int i=0 ; i<a.length -1 ; i++)
		{
			for(int j=a[i]+1 ; j<a[i+1] ; j++) 
			{
				System.out.printf("%d\t",j);
			}
		}
	}
}