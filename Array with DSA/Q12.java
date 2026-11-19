import java.util.Scanner;
class Q12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		
		int a[] =  new int[size];
		for(int i=0 ; i<a.length-1 ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("array before insertion");
		for(int i=0 ; i<a.length-1 ; i++)
		{
			System.out.printf("index = %d , value = %d\n",i,a[i]);
		}
		
		System.out.println("enter position to insert :");
		int pos = sc.nextInt();
		System.out.println("enter value :");
		int value = sc.nextInt();
		
		for(int i=(a.length-2) ; i>=pos ; i--)
		{
			a[i+1] = a[i];
		}
		a[pos] = value;
		
		System.out.println("array after insertion");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.printf("index =%d, value =%d\n",i,a[i]);
		}
	}
}