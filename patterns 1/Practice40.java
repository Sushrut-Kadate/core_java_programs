class Practice40
{
	public static void main(String x[])
	{
		int n = 1;
		char ch = 'A';
		for(int i=1 ; i<=5 ; i++)
		{
			int charToNum = ch;
			for(int j=1 ; j<=5 ; j++)
			{
				if(j<=i)
				{
					if(i%2!=0)
					{
						System.out.print(n+ " ");
						n++;
					}
					else
					{
						System.out.print(ch + " ");
						ch++;
					}
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