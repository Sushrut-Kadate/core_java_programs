import java.util.Scanner;
class Q17
{
	public static void main(String x[])
	{
		int a[] = {10,15,20,25,30};
		int evenCount = 0; int oddCount = 0;
		
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] %2 ==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Even Count"+evenCount);
		System.out.println("Odd Count"+oddCount);

	}
}