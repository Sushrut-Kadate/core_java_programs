import java.util.Scanner;
class Q58
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw :");
		int withdrawAmount = sc.nextInt();
		
		double balance = 120.00;
		double charges = 0.50;
		
		if(withdrawAmount > balance)
		{
			System.out.println("Not Enough money to withdraw "+" Current Balance is :"+balance);
		}
		else if(balance % 5 ==0)
		{
			balance = balance - (withdrawAmount + charges); 
			System.out.println("Balance after withdrawn :"+balance);
		}
	}
}