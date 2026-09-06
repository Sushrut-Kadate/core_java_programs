import java.util.Scanner;
class Q53
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int d1 = num / 100;
		System.out.println("First Digit :"+d1);
		
		int d2 = num % 10;
		System.out.println("Last Digit :"+d2);
		
		int largerDigit = (d1 > d2) ? d1 : d2 ;
		System.out.println("Larger Digit is :"+largerDigit);
	}
}