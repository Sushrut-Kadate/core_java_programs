import java.util.Scanner;
class Q50
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int diff = (m>n) ? (m-n):(n-m);
		String msg = (diff > 10) ? "Diff greater than 10":"Diff smaller than 10";
		System.out.println(msg);
	}
}