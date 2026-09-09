import java.util.Scanner;
class Q5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 5 ==0 && num % 11 ==0)
		{
			System.out.println("Divisible by 5 and 11");
		}
		else
		{
			System.out.println("Not Divisible by 5 and 11");
		}
	
	}
}