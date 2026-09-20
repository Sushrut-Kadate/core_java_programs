import java.util.Scanner;
class Q30
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month :");
		int month = sc.nextInt();
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
		{
			int days = 31;
			System.out.println("No of days : "+days);
		}
		else if(month == 4 || month == 6 || month == 9 ||  month == 11)
		{
			int days = 30;
			System.out.println("No of days : "+days);
		}
		else if(month == 2)
		{
			System.out.println("Is it a Leap Year ?");
			boolean leapYear = sc.nextBoolean();
			if(leapYear)
			{
				System.out.println("No of days is 29");
			}
			else
			{
				System.out.println("No of days is 28");
			}
		}
		else
		{
			System.out.println("Enter a valid month");
		}	
	}
}