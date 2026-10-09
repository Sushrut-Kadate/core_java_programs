import java.util.Scanner;
class Q62
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 2 nums :");
		int n1 = sc.nextInt(); int n2 = sc.nextInt();
		
		System.out.println("Enter you choice ");
		char c = sc.next().charAt(0);
		
		switch(c)
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
			if(n1 / n2 == 0)
			{
				System.out.println("division by zero");
			}
			else 
			{
				System.out.println(n1 / n2);
			}
		}
	}
}