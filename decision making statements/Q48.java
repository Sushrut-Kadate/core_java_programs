import java.util.Scanner;
class Q48
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the test case :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x < y)
		{
		System.out.println("No");
		}
		else if(x == y)
		{
		System.out.println("Yes");
		}
		else if(x > y)
		{
		System.out.println("Yes");
		}
	}
}