import java.util.Scanner;
class Q56
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the alphabet");
		char c = sc.next().charAt(0);
		
		switch(c)
		{
			case 'a': case 'e': case 'i': case 'o': case 'u':
			System.out.println("vowel");
			break;
			
			default:
			System.out.println("consonant");
		}
	}
}