import java.util.Scanner;
class Q39
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter attendance :");
		System.out.println("enter marks");
		int attendance = sc.nextInt();
		int marks = sc.nextInt();
		
		if(attendance >= 75 && marks >=80)
		{
			System.out.println("Eligible for scholarship");
		}
		else
		{
			System.out.println("Not eligible for scholarship");
		}
	}
}