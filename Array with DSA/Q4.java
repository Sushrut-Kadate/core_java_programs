class Q4
{
	public static void main(String x[])
	{
		int a[] = {5,10,15,20,25,30};
		
		System.out.println("Value at Even Index ");
		for(int i=0 ; i<a.length ; i++)
		{
			if(i%2 == 0)
			{
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.println("\nValues at Odd Index");
		for(int i=0 ; i<a.length ; i++)
		{
			if(i%2 !=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}