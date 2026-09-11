import java.util.Scanner;
class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character :");
		char ch = sc.next().charAt(0);
		
		/*
		if(ch == 'a' || ch =='e' || ch =='i' || ch=='o' || ch=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
		*/
		int charToNum = ch;
		if(charToNum >=65 && charToNum <=122)
		{
			System.out.println("Alphabet");
		}
		else if(charToNum >=0 && charToNum <=9)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special character");
		}
	}
}