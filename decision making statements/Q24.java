import java.util.Scanner;
class Q24
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if(ch >='A' && ch <='Z')
		{
		System.out.println("Uppercase Alphabet");
		}
		else
		{
			System.out.println("Lowercase Alphabet");
		}
	}
}