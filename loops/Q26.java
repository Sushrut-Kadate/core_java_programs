import java.util.Scanner;
class Q26
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt();
		
		int square = n * n;
		System.out.println("square of number is : "+square);
		int sum = 0; 
		
		while(square != 0)
		{
			int lastDigit = square % 10;
			sum = sum + lastDigit;
			square = square / 10;			
		}
		
		if(sum == n)
		{
			System.out.println("neon number");
		}
		else
		{
			System.out.println("not neon");
		}
	}
}