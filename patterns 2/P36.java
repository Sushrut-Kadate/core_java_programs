class P36
{
	public static void main(String x[])
	{
		
		for(int i=1 ; i<=5 ; i++)
		{
			int k=1;
			boolean flag = true;
			for(int j=1 ; j<=9 ; j++)
			{
				if(j>=6-i && j<=4+i && flag)
				{
					System.out.print(k+"  ");
					k++;
					flag = false;
				}
				else
				{
					System.out.print("   ");
					flag = true;
				}
			}
			System.out.println();
			}
		}
	}
