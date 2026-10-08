import java.util.Scanner;
class Q53
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num 1 and num 2 ");
		int n1 = sc.nextInt(); int n2 = sc.nextInt();
		
		char ch = sc.next().charAt(0);
		switch(ch)
		{
			case '+':
			System.out.println(n1 + n2);
			break;
			
			case '-':
			System.out.println(n1 - n2);
			break;
			
			case '*':
			System.out.println(n1 * n2);
			break;
			
			case '/':
			if(n2 !=0)
			{
			System.out.println(n1 / n2);
			}
			else
			{
			System.out.println("Division by zero");
			}
			break;
			
			case '%':
			System.out.println(n1 % n2);
		
			default:
			System.out.println("Invalid Input");
		}
	}
}