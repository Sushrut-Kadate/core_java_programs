class P47
{
	public static void main(String x[])
	{
		for(int i=1 ; i<=9 ; i++)
		{
			int k=1;
			boolean flag = true;
			for(int j=1 ; j<=9 ; j++)
			{
				if(j>=6-i && j<=4+i && i<=5 && flag)
				{
					System.out.print(k+" ");
					flag = false;
					k++;
				}
				else if(j>=i-4 && j<=14-i && i>5 && flag)
				{
					System.out.print(k+" ");
					flag = false;
					k++;
				}
				else
				{
					System.out.print("  ");
					flag = true;
				}
			}
			System.out.println();
		}
	}
}