import java.util.Scanner;
class Q44 
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of days late :");
		int days = sc.nextInt();
		int fine = 0;
		String membershipStatus = "Active";
		if(days <= 5)
		{
		fine = days * 2;
		System.out.println("Fine "+fine);
		}
		else if(days >=6 && days <=11)
		{
		fine = days * 3;
		System.out.println(fine);
		}
		else if(days >=11 && days <=30)
		{
		fine = days * 5;
		System.out.println(fine);
		}
		else 
		{
		fine = days * 500;
		membershipStatus = "Canceled";
		System.out.println("Membership Status :"+membershipStatus +" Fine "+fine);
		}
	}
}