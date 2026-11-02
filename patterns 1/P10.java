class P10
{
	public static void main(String x[])throws InterruptedException
	{
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j <=9 ; j++)
			{
				if(j<=10-i && j>=i)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			Thread.sleep(3000);
			System.out.println();
		}
	}
}