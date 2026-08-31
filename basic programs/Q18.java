import java.util.Scanner;
class Q18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of days");
		int days = sc.nextInt();
		
		int year = days/365;
		System.out.println("Years : "+year);
		
		int remaningDays = days - (year*365);
		int months = remaningDays / 30;
		System.out.println("Months :"+months);
		
		int finalRemainingDays = months % 30;
		String msg = finalRemainingDays <=7 ? "Weeks 1 " : "Weeks more than 1";
		System.out.println(msg);
	}
}