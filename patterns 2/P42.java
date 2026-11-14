class P42
{
	public static void main(String x[])
	{
		int k = 1;
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				System.out.print(k+" ");
				k++;
				if(k > 8)
				{
					k = 1;
				}
			}
			System.out.println();
		}
	}
}