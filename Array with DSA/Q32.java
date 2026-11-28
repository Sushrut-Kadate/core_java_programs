class Q32
{
	public static void main(String x[])
	{
		int a[] = {10,12,15,17,20};
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] % 5 == 0)
			{
				a[i] = 5;
			}
		}
		
		System.out.println("Array ");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.printf("%d ",a[i]);
		}
	}
}