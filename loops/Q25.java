import java.util.Scanner;
class Q25
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();  // 153
		
		int temp = 0;
		int count = 0;
		int original = n;
		
		int d1 = n % 10;  // 3
		int upD1 = n / 10; // 15
		
		int d2 = upD1 % 10; // 5
		int upD2 = upD1 / 10; // 1
		
		int d3 = upD2 % 10; // 1

		while(n != 0)
		{
			temp = n % 10;
			count++;
			n = n / 10;
		}
		System.out.println("No of digits in number are : "+count);
		
		double n1 = Math.pow(d1,count); // 3
		double n2 = Math.pow(d2,count); // 5
		double n3 = Math.pow(d3,count); // 1
		
		double sum = n3 + n2 + n1;
		System.out.println("sum : "+sum);
		System.out.println("original : "+original);
		
		if(sum == original)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not armstrong");
		}
		
	}
}