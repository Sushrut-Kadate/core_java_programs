class P26
{
	public static void main(String x[])
	{
		/*
			1 	2	3	4	5	
		1	#	#	#	#	#
		2	#	#
		3	#		#
		4	#			#
		5	#				#
		
		*/
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				if(i==1 || j==1 || j==i)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}