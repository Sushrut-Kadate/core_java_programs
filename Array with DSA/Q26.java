class Q26
{
	public static void main(String x[])
	{
		int a[] = {1,4,5,0};
		int count = 0;
		int targetSum = 5;
		
		for(int i=0 ; i<a.length ; i++)
		{
			for(int j=i+1 ; j<a.length ; j++)
			{
				if(a[i] + a[j] == targetSum )
				{
					count++;
				}
			}
		}
		System.out.println("Number of Pairs : "+count);
	}
}


