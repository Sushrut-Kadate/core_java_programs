import java.util.Scanner;
class Q56
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prices XX and YY :");
		int xx = sc.nextInt(); int yy = sc.nextInt();
		
		String msg = (xx < yy) ? "FIRST" : (xx > yy) ? "SECOND" : "ANY";
		System.out.println(msg);
	}
}