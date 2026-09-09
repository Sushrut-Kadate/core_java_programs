import java.util.Scanner;
class Q6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character :");
		char ch = sc.next().charAt(0);
		
		int chToNum = ch;
		if(chToNum >=65 && chToNum<=122)
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Not Alphabet");
		}
	}
}