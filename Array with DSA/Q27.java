class Q27
{
	public static void main(String x[])
	{
		int a[] = {1,2,2,3,3,3,4};
		boolean visited[] = new boolean[a.length];
		
		for(int i=0 ; i<a.length ; i++)
		{
			if(visited[i])
			{
				continue;
			}
			
			int count = 1;
			for(int j=i+1 ; j<a.length ; j++)
			{
				if(a[i] == a[j])
				{
					visited[j] = true;
					count++;
					break;
				}
			}
			
			System.out.println(a[i]+" :"+count+" times");
		}
		
	}
}

