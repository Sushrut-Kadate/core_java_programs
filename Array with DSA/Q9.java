import java.util.Scanner;
class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int s = sc.nextInt();
		
		int a[] = new int[s];
		int b[] = new int[a.length];
		
		for(int i=0 ; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Array1");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.printf("%d,\t",a[i]);
		}
		
		for(int i=0 ; i<a.length ; i++)
		{
			b[i] = a[i];
		}
		
		System.out.println("\nArray2");
		for(int i=0 ; i<b.length ; i++)
		{
			System.out.printf("%d,\t",b[i]);
		}
		
	}
}