class Q35
{
	public static void main(String x[])
	{
		int a[] = {2,4,6,8};
		int b[] = new int[a.length];
		
		for(int i=0 ; i<a.length ; i++)
		{
			b[i] = a[i] * a[i];
		}
		
		System.out.println("New Array");
		for(int k : b)
		{
			System.out.print(k+" ");
		}
	}
}