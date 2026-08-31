import java.util.Scanner;
class Q19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int cube = n * n * n;
		System.out.println(cube);
		
		sc.close();
	}
}