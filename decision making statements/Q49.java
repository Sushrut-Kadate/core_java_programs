import java.util.*;
class Q49
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the credit score :");
		int score = sc.nextInt();
		
		if(score > 750)
		{
		System.out.println("Can access cred programs");
		}
		else 
		{
		System.out.println("Can't access programs ");
		}
	}
}