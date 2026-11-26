class Q30
{
	public static void main(String x[])
	{
		int a[] = {3,6,7,9,10};
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] % 3 ==0)
			{
				a[i] = -1;
			}
		}
		
		System.out.println("array :");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.printf("%d ,",a[i]);
		}
	}
}