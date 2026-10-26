class P2
{
	public static void main(String x[]) throws InterruptedException
	{
		/*
		
		1	2	3	4	5
	1	*	*	*	*	*
	2	*				*
	3	*				*
	4	*				*
	5	*	*	*	*	*

		*/
		
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				Thread.sleep(300);
			}
			System.out.println();
		}
	}
}