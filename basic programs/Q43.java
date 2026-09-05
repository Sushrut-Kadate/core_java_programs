import java.util.Scanner;
class Q43
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		String msg = num1 == num2 ? "equal":"not equal";
		System.out.println(msg);
	}
}