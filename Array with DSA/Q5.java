class Q5
{
	public static void main(String x[])
	{
		int a[] = {12,17,24,39,40,55,70};
		int evenCounter = 0;
		int oddCounter = 0;
		
		for(int i=0 ; i<a.length ; i++)
		{
			if(i%2==0)
			{
				evenCounter++;
			}
			else
			{
				oddCounter++;
			}
		}
		System.out.println("Even values "+evenCounter);
		System.out.println("Odd values "+oddCounter);
	}
}