import java.util.Scanner;
class Q58
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the level");
		int level = sc.nextInt();
		
		switch(level)
		{
			case 1:
			System.out.println("Junior "+"Salary 20,000 - 30,000");
			break;
			case 2:
			System.out.println("Mid "+"Salary 31,000 - 50,000");
			break;
			case 3:
			System.out.println("Senior "+"Salary 51,000 - 80,000");
			break;
		}
	}
}