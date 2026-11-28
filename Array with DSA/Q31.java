class Q31
{
	public static void main(String x[])
	{
		int a[] = {5,3,7,2};
		a[0] = 0; 
		a[a.length - 1] = 0;
		
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.printf("%d ",a[i]);
		}
	}
}