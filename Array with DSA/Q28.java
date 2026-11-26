class Q28
{
	public static void main(String x[])
	{
		int a1[] = {1,2,3};
		int a2[] = {2,3,4,5};
		
		// Merge a1 and a2 to a3 
		int a3[] = new int[a1.length + a2.length];
		
		int k=0;
		for(int i=0 ; i<a1.length ; i++)
		{
			a3[k] = a1[i];
			k++;
		}
		
		for(int j=0 ; j<a2.length ; j++)
		{
			a3[k] = a2[j];
			k++;
		}
		//System.out.println("k is :"+k);
		System.out.println("Array after merging :");
		for(int i=0 ; i<a3.length ; i++)
		{
			System.out.printf("%d ",a3[i]);
		}
		
		int unionArr[] = new int[a3.length];
		int n = 0;
		
		for(int i=0 ; i<a3.length ; i++)
		{
			boolean flag = false;
			for(int j=0 ; j < n ; j++)
			{
				if(a3[i] == unionArr[j])
				{
					flag = true;
					break;
				}
			
			}
			if(!flag)
			{
				unionArr[n] = a3[i];
				n++;					
			}
		}
		
		System.out.println("\nUnion Array :");
		for(int i=0 ; i<n ; i++)
		{
			System.out.printf("%d ",unionArr[i]);
		}
	}
}