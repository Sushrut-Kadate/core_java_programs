import java.util.Scanner;
class Q11 
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int s = sc.nextInt();
		
		int a[] =  new int[s];
		for(int i=0 ; i<a.length ; i++) // input 
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("displaying array");
		for(int i=0 ; i<a.length ; i++) // display
		{
			System.out.printf("%d\t",a[i]);
		}
			
		int large1=a[0];
		for(int i=0 ; i<a.length ; i++) // largest 
		{
			if(a[i]>large1)
			{
				large1 = a[i];
			}
		}
		System.out.println("Largest :"+large1);
		
		int large2 = a[0];
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] > large2 && a[i] < large1)
			{
				large2= a[i];
			}
		}
		System.out.println("Second largest :"+large2);
	}
}