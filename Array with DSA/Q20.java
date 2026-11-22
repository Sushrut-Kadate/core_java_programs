import java.util.Scanner;
class Q20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {10,25,5,40,18};
		System.out.println("enter the number :");
		int num = sc.nextInt();
		
		System.out.println("elements greater than "+num+" :");
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] > num)
			{
				System.out.printf("%d ",a[i]);
			}
		}
	}
}