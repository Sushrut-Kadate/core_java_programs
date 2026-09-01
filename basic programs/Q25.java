import java.util.Scanner;

class Q25
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		
		int num = sc.nextInt();
		int d1 = num % 10;
		int updateNumValeD1 = num / 10;
		System.out.println(d1);
		
		int d2 = updateNumValeD1 % 10;
		int updateNumValeD2 = updateNumValeD1 / 10;
		System.out.println(d2);
		
		int d3 = updateNumValeD2 % 10;
		System.out.println(d3);
		
		int reverse = d1 * 100 + d2 * 10 + d3;
		String msg = num == reverse ? "Palindrome":"Not Palindrome";
		System.out.println(msg);
	}
}