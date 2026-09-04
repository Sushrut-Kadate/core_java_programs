import java.util.Scanner;
class Q39
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet");
		char ch = sc.next().toLowerCase().charAt(0);
		
		String msg = (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u') ? "Vowel":"Consonent";
		System.out.println(msg);
	}
}