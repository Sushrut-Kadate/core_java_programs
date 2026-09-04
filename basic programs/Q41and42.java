import java.util.Scanner;
class Q41and42
{
	public static void main(String x[])
	{
		/*
		int a = 10; int b = 25; int c = 15;
		if(a>b && a>c)
		{
		System.out.println("MAX :"+a);
		}
		else if(b>a && b>c)
		{
		System.out.println("MAX :"+b);
		}
		else
		{
		System.out.println("MAX :"+c);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age :");
		int age = sc.nextInt();
		
		if(age >=18)
		{
			System.out.println("Eligible to Vote");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
}