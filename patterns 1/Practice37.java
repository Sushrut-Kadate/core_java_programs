class Practice37
{
	public static void main(String x[])
	{
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=9 ; j++)
			{
				if(j<=4+i && j>=6-i)
				{
					System.out.print(j-(6-i)+1+" ");
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