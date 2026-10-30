class P6
{
	public static void main(String x[])
	{
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				if(j==5 || i==5)
				{
					System.out.print(" *");
				}
				else if((j==4 && i==2) || (j==4 && i==3) || (j==4 && i==4))
				{
					System.out.print(" *");
				}
				else if((j==3 && i==3) || (j==3 && i==4))
				{
					System.out.print(" *");
				}
				else if(j==2 && i==4)
				{
					System.out.print(" *");
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