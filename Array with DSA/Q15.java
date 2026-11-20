import java.util.Scanner;
class Q15
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array1 size ");
		int s1 = sc.nextInt();
		
		int a[] = new int[s1];
		for(int i=0 ; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("enter array2 size ");
		int s2 = sc.nextInt();
		
		int b[] = new int[s2];
		for(int j=0 ; j<b.length ; j++)
		{
			b[j] = sc.nextInt();
		}
		
		int common[] = new int[a.length + b.length];
		int k = 0;
		
		for(int i=0 ; i<a.length ; i++)
		{
			boolean found = false;
			
			for(int j=0 ; j<b.length ; j++)
			{
				if(a[i] == b[j])
				{
					found = true;
					common[k] = a[i];
					k++;
					break;
				}
				else
				{
					found = false;
				}
			}
		}
		
		System.out.println("common elements");
		for(int i=0 ; i<k ; i++)
		{
			System.out.printf("%d ",common[i]);
		}
	}	
}