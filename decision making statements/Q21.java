import java.util.Scanner;
class Q21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int num = sc.nextInt();
		
		double sq = Math.pow(num,2);
		System.out.println("Square of num :"+" "+sq);
		
		int d1 = num % 10;
		int updateNum = num / 10;
		int d2 = updateNum % 10;
		
		int sum = d1 + d2;
		if(sum == num)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not a Neon Number");
		}
	}
}