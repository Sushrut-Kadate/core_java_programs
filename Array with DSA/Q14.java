import java.util.Scanner;
class Q14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int s = sc.nextInt();
		
		int a[] = new int[s];
		System.out.println("enter array");
		for(int i=0 ; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("displaying array with duplicates");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.printf("%d  ",a[i]);
		}
		
		int unique[] = new int[a.length];
		int k = 0;
		
		for(int i=0 ; i<a.length ; i++)
		{
			boolean found = false;
			for(int j=0 ; j<k ; j++)
			{
				if(a[i] ==  unique[j])
				{
					found = true;
					break;
				}
			}
			
			if(found == false)
			{
				unique[k] = a[i];
				k++;
			}
		}
		
		System.out.println("\narray after removing duplicates");
		for(int i=0 ; i < k ; i++)
		{
			System.out.printf("index -> %d , value -> %d\n",i,unique[i]);
		}
	}
}