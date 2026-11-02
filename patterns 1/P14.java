class P14
{
	public static void main(String x[]) throws InterruptedException
	{
		/*
		
			 *******
			 ******
 			 *****
 			 ****
 			 ***
 			 **
 			 *
 			 **
 			 ***
 			 ****
 			 *****
 			 ******
 			 *******

		
		*/
		for(int i=1 ; i<=13 ; i++)
		{
			for(int j=1 ; j<=7 ; j++)
			{
				if(j>=i && i<=7)
				{
					System.out.print("*");
				}
				else if(i>=8 && j<=i-6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("");
				}
			}
			Thread.sleep(1000);
			System.out.println();
		}
		
	}
}