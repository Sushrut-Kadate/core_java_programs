import java.util.Scanner;
class Q36
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		int charToNum = ch;
		String msg = ((charToNum >=65 && charToNum<=90) || (charToNum >=97 && charToNum <=122)) ? "Alphabet":"Not Alphabet";
		System.out.println(msg);
	}
}