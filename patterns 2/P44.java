class P44
{
	public static void main(String x[])
	{
		int k = 1;
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				if((j%2!=0 && i%2==0) || (j%2==0 && i%2!=0))
				{
					System.out.print(k+" ");
					k++;
				}
				else
				{
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
}