class P45
{
	public static void main(String x[])
	{
		int k=1;
		for(int i=1; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				if(i==j || j==1 || i==5 )
				{
					System.out.print(k+" ");
					k++;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}