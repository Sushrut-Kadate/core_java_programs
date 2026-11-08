class P28
{
	public static void main(String x[])
	{
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=1 ; j<=9 ; j++)
			{
				if((j>=6-i && j<=4+i && i<=5 && j%2!=0 && i%2!=0) || (j>=6-i && j<=4+i && i<=5 && j%2==0 && i%2==0)) 
				{
					System.out.print("* ");
					//flag = false;
				}
					else if((j>=i-4 && j<= 14-i && i>5 && j%2!=0 && i%2!=0) || (j>=i-4 && j<= 14-i && i>5 && j%2==0 && i%2==0))
				{
					System.out.print("* ");
				}
					else
				{
					System.out.print("  ");
					//flag = true;
				}
	
			}
			System.out.println();
		}
	}
}