import java.util.Scanner;
class Q33
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("total no of candies :");
		int candies = sc.nextInt();
		int minCandies = 5;
		System.out.println("enter no of candies to order ");
		int k = sc.nextInt();
		
		int remaining = 0;
		if(k > candies)
		{
			System.out.println("invalid input");
		}
		else if(k < minCandies)
		{
			System.out.println("No of candies sold :"+ k);
			remaining = candies - k;
			System.out.println("No of candies available :"+ remaining);
		}
		else if(remaining < minCandies)
		{
			System.out.println("Refill the Jar :");
			System.out.println("After Refill candies are :"+candies);
		}
		else{
			System.out.println("ordered 0 candies");
		}
	}
}