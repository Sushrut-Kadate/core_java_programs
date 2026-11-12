class P39
{
	public static void main(String x[])
	{
		for(int i=5 ; i>=1 ; i--)
		{
			for(int j=1 ; j<=i ; j++)
			{
				if(j%2!=0)
				{
					System.out.print(i+" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}