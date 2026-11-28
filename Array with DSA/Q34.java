class Q34
{
	public static void main(String x[])
	{
		int a[] = {10,5,3,4,3,5,6};
		int result = -1;
		boolean flag = false;
		
		for(int i=0 ; i<a.length ; i++)
		{
			for(int j=i+1 ; j<a.length ; j++)
			{
				if(a[i] == a[j])
				{
					flag = true;
					result =  a[i];
					break;
				}
			}
			
			if(flag)
			{
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("first repeating element :"+result);
		}
		else
		{
			System.out.println("no repeating element found");
		}
	}
}