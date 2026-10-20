import java.util.Scanner;
class Q15
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character :");
		char c = sc.next().charAt(0);
		
		while(c <='Z' || c<='z')
		{
			int charToNum = c;
			System.out.println(c + ": "+charToNum);
			c++;
		}
	}
}