import java.util.Scanner;
class Q38
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		String msg = (year % 4 ==0) || (year % 100 == 0) ? "Leap Year":"Not Leap Year";
		System.out.println(msg);
	}
}