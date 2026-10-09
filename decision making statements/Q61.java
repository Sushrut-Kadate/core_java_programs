import java.util.Scanner;
class Q61
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice ");
		int c = sc.nextInt();
		
		switch(c)
		{
			case 1:
			System.out.println("burger : Rs 120");
			break;
			
			case 2:
			System.out.println("pizza : Rs 150");
			break;
			
			case 3 :
			System.out.println("pasta : Rs 100");
			break;
			
			case 4 :
			System.out.println("sandwich : Rs 130");
			break;
		}
	}
}