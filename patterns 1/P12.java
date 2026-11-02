class P12
{
	public static void main(String x[])throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=i)
				{
					if(i==1 || i==3 || i==5)
					{
						System.out.print("# ");
					}
					else if(i==2 || i==4)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			Thread.sleep(2000);
			System.out.println();
		}
	}
}