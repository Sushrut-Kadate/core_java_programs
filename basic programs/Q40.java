import java.util.Scanner;
class Q40
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		int charToNum = ch;
		String msg = ((charToNum >=65 && charToNum <=122) || (ch == 0 && ch <=9))? "Aplhabet":"Digit";
		System.out.println(msg);
	}
}