import java.util.Scanner;
class Q24
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		
		int sq = num * num;
		System.out.println(sq);
		
		int neon = (sq/10) + sq % 10;
		System.out.println(neon);
		
		String msg = sq >= neon ? "Number is Neon" : "Not Neon";
		System.out.println(msg);
	}
}