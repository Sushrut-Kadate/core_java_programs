class P32
{
	public static void main(String x[])
	{
		for(int i=1 ; i<=6 ; i++)
		{
			for(int j=1 ; j<=6 ; j++)
			{
				if( (i%2!=0 && j<=i))
				{
					System.out.print("* ");
				}
				else if(i%2==0 && j<=i)
				{
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
}