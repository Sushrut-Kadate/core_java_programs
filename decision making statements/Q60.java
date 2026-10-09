import java.util.Scanner;
class Q60
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num 1-4 :");
		int n = sc.nextInt();
		
		switch(n)
		{
			case 1:
			System.out.println("spring");
			break;
			case 2 :
			System.out.println("summer");
			break;
			case 3:
			System.out.println("autumn");
			break;
			case 4:
			System.out.println("winter");
			break;
			default :
			System.out.println("Enter a valid case num");
		}
	}
}