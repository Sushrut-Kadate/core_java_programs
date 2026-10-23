import java.util.Scanner;
class Q20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = sc.nextInt();
		
		int original = n;
		int last = n % 10;
		while(n >=10)
		{
			n = n / 10;
		}
		System.out.println("first number "+n);
		System.out.println("last number "+last);
		
		int temp = original;
		int count = 0;
		
		while(temp >=10)
		{
			temp = temp / 10;
			count++;
		}
		
		int power = 1;
		for(int i=1 ; i<=count ; i++)
		{
			power = power * 10;
		}
		
		int middle = (original % power) / 10;
		
		int swap = last * power + middle * 10 + n;
		System.out.println("Swapped number : "+swap);
	}
}