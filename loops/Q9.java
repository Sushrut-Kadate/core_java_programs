import java.util.Scanner;
class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while (i <= 10)
		{
			sum = n * i;
			System.out.println(n + " x"+ " "+i + " ="+ " "+sum);
			i++;
		}
	}
}