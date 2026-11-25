class Q25
{
	public static void main(String x[])
	{
		int a[] = {0,1,0,3,12};
		int index = 0;
		
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] != 0)
			{
				a[index] = a[i];
				index++;
			}
		}
		while(index < a.length)
		{
			a[index] = 0;
			index++;
		}
		
		System.out.println("Array After Moving Zeros");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.printf("%d ",a[i]);
		}
	}
}