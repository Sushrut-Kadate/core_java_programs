import java.util.Scanner;
class Q26
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int d1 = num % 10; // 2
		int updateNumD1 = num /10; // 141
		
		int d2 = updateNumD1 % 10; // 1
		int updateNumD2 = updateNumD1 / 10; // 14
		
		int d3 = updateNumD2 % 10; // 4
		int updateNumD3 = updateNumD2 / 10; // 1
		
		int d4 = updateNumD3 % 10; // 1
		
		int sum = d4 + d3 + d2 + d1;
		int product = d4 * d3 * d2 * d1;
		
		String msg = sum == product ? "Spy Number":"Not Spy Number";
		System.out.println(msg);
	}
}