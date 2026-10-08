import java.util.Scanner;
class Q59
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");
		
		System.out.println("enter your choice");
		int choice = sc.nextInt();
		
		double amount = 0;
		double balance = 1500;
		int withdraw = 0;
		switch(choice)
		{
			case 1:
			System.out.println("enter amount to deposit");
			amount = sc.nextDouble();
			double updatedBalance = balance + amount;
			System.out.println("Amount Deposited "+updatedBalance);
			break;
		
			case 2:
			System.out.println("enter amount to withdraw");
			withdraw = sc.nextInt();
			double withdrawbalance = updatedBalance - withdraw;
			System.out.println("balance after withdraw "+withdrawbalance);
			break;
			
			case 3:
			System.out.println("Current Balance :"+balance);
			break;
			
			case 4:
			System.out.println("Exit from process");
			break;
		}
	}
}