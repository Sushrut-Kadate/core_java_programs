import java.util.Scanner;
class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("input array size");
		int s = sc.nextInt();
		
		System.out.println("enter elements in ascending order");
		int a[] = new int[s];
		for(int i=0 ; i<a.length ; i++)
		{
			a[i] =  sc.nextInt();
		}
		
		System.out.println("display array ");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		System.out.println("\n enter position to delete: ");
		int pos = sc.nextInt();
		
		for(int i=pos-1 ; i<a.length-1 ; i++)
		{
			a[i] = a[i+1];
		}
		
		System.out.println("\narray after deletion");
		for(int i=0 ; i<a.length-1 ; i++)
		{
			System.out.printf("%d\n",a[i]);
		}
	}
}