class P1
{
	public static void main(String x[])
	{
		/*
			1 	2	3	4	5
		1	*	*	*	*	*
		2	*	*	*	*	*
		3	*	*	*	*	*
		4	*	*	*	*	*
		5	*	*	*	*	*

		*/
		
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				System.out.print("*");
			}
			System.out.printf("\n");
		}
	}
}