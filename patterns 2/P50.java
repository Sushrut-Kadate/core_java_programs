class P50
{
	public static void main(String x[])
	{
		for(int i=1 ; i<=7 ; i++)
		{
			for(int j=1 ; j<=4 ; j++)
			{
				if(j>=5-i && i<=4)
				{
					System.out.print(i+" ");
				}
				else if(i>=5 && j>=i-3)
				{
					System.out.print(8-i+" ");
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