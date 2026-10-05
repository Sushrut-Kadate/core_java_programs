import java.util.Scanner;
class Q47
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the money to withdraw");
		int withdraw = sc.nextInt();
		
		double charges = 0.50;
		double balance = 120;
		System.out.println("Balance before withdraw :"+balance);
		
		if(withdraw % 5 ==0 && withdraw < balance)
		{
			balance = balance - withdraw + charges;
			System.out.println("Balance after withdrawal :"+balance);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}