import java.util.Scanner;
class Q19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score :");
		int score = sc.nextInt();
		
		String msg = (score >=90) ? "Excellent" : (score >=75) ? "Good" : (score >=50) ? "Average" : "Poor";
		System.out.println(msg);
	}
}