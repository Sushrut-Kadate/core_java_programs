class Q33
{
	public static void main(String x[])
	{
		int a[] = {1,2,3,2,1};
		int left = 0;
		int right = a.length-1;
		
		boolean flag = true;
		while(left < right)
		{
			if(a[left] != a[right])
			{
				flag = true;
				break;
			}
			left++;
			right--;
		}
		
		if(flag)
		{
			System.out.println("Array is Palindrome");
		}
		else
		{
			System.out.println("Array is not Palindrome");
		}
	}
}