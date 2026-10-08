import java.util.Scanner;
class Q57
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		
		switch(n)
		{
			case 1:
			System.out.println("one");
			break;
			case 2:
			System.out.println("two");
			break;
			case 3:
			System.out.println("three");
			break;
			case 4:
			System.out.println("four");
			break;
			case 5:
			System.out.println("five");
			break;
			default:
			System.out.println("Invalid Number");
			break;
		}
	}
}
