class Practice41
{
	public static void main(String x[])
	{
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				int num = 2;
				if(j<=i)
				{
					boolean flag = false;
					while(num % 2 !=0 && num % num == 0 && num % 1 == 0)
					{
						flag = true;
						System.out.print(num + " ");
						num++;
						break;
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