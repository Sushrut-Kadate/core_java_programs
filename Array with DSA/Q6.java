import java.util.Scanner;
class Q6
{ 
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {10,20,30,40,50};
		System.out.println("enter element to search ");
		int n = sc.nextInt();
		boolean flag = false;
		for(int i=0 ; i<a.length ; i++)
		{
			if(n == a[i])
			{
				flag = true;
				System.out.printf("element %d fount at index -> %d",n,i);
				break;
			}
		}
	}
}