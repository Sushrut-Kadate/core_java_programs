import java.util.Scanner;
class Q54
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the grades");
		char ch = sc.next().charAt(0);
		
		switch(ch)
		{
			case 'a':
			System.out.println("excellent");
			break;
		
			case 'b':
			System.out.println("good");
			break;
			
			case 'c':
			System.out.println("average");
			break;
			
			case 'd':
			System.out.println("poor");
			break;
			
			case 'f':
			System.out.println("fail");
			break;
		}
	}
}