import java.util.Scanner;
class Q17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		int i = 1; 
		System.out.println("factors are :");
		while(i <=n )
		{
			if(n % i == 0)
			{
			System.out.println(i + " ");
			}
			i++;
		}
	}
}