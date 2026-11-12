class P35
{
	/*
	
	1	2	3	4	5
	1	2	3	4	5
	1	2	3	4	5
	1	2	3	4	5
	1	2	3	4	5

	
	*/
	
	public static void main(String x[])
	{
		for(int i=1 ; i<=5 ; i++)
		{
			int k=1;
			for(int j=1 ; j<=5 ; j++)
			{
				if(j==k)
				{
					System.out.print(j+" ");
					k++;
				}
			}
			System.out.println();
		}
	}
}