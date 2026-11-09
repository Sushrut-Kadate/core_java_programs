class P34
{
	public static void main(String x[])
	{
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				if(j==4-i || j==2+i || i==4 || i==6 || (i==5 && j%2!=0) || j==i-6 || j==12-i)
				{
					System.out.print("* ");
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