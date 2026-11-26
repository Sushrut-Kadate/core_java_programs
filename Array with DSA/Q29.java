class Q29
{
	public static void main(String x[])
	{
		int a[] = {1,2,3,4,5,6};
		
		int k = 0,j=0;
		
		int even[] = new int[3];
		int odd[] = new int[3];
		
		int result[] = new int[a.length];
		
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] % 2 ==0)
			{
			    even[k++]=a[i];	
			}
			
		}
	
		System.out.print("Even Array\n");
		for(int i=0 ; i<even.length ; i++)
		{
			System.out.printf("%d ",even[i]);
		}
		
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] % 2 !=0)
			{
			    odd[j++]=a[i];	
			}
			
		}
	
		System.out.print("\nodd Array\n");
		for(int i=0 ; i<odd.length ; i++)
		{
			System.out.printf("%d ",odd[i]);
		}
		
		for(int i=0;i<even.length;i++)
		{
			result[i]=even[i];
		}
		for(int i=0;i<odd.length;i++)
		{
			result[i+3]=odd[i];
		}
		
		for(int i=0 ; i<even.length ; i++)
		{
			result[2 * i] = even[i];
			result[2 * i + 1] = odd[i];
		}
		
		System.out.println("\nOutput Array :");
		for(int i=0 ; i<result.length ; i++)
		{
			System.out.printf("%d ",result[i]);
		}
	}
}