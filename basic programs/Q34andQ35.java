import java.util.Scanner;
class Q34andQ35
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		/*
		if(num % 2 == 0 && num > 0){
		System.out.println("Even Number");
		}
		else
		{
		System.out.println("Negative Number");
		}
		*/
		
		int rem = num % 5;
		System.out.println("Remainder when divided by 5 :"+rem);
		
		int rem1 = num % 11;
		System.out.println("Remainder when divided by 11 :"+rem1);
		
		String msg = rem == rem1 ? "Divisible by 5 and 11":"Not Divisible by 5 and 11";
		System.out.println(msg);
	}
}