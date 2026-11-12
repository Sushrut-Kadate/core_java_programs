class P37
{
	public static void main(String x[])
	{
		int n = 1;
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				if(j<=i)
				{
					System.out.print(n+" ");
					n++;
				}
			}
			System.out.println();
		}
	}
}