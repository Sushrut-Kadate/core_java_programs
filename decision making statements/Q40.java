import java.util.Scanner;
class Q40
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter sales amount :");
		int sales = sc.nextInt();
		double commision = 0;
		if(sales < 5000)
		{
			commision = sales * 2/100;
			System.out.println("commision "+commision);
		}
		else if(sales > 5000 && sales < 10000)
		{
			System.out.println("commision "+ (sales * 5/100));
		}
		else
		{
		System.out.println("commision "+(sales * 10/100));
		}
	}
}