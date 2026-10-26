class P3
{
	public static void main(String x[])
	{
		/*
		
		1	2	3	4	5	
	1	*	#	*	#	*
	2	*	#	*	#	*
	3	*	#	*	#	*
	4	*	#	*	#	*
	5	*	#	*	#	*

		*/
	
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				if(j==1 || j==3 || j==5)
				{
					System.out.print("* ");
				}
				else if(j==2 || j == 4)
				{
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	
	}
}