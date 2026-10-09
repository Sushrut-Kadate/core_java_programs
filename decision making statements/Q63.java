import java.util.Scanner;
class Q63
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter you choice :");
		int choice = sc.nextInt();
		int n;
		
		switch(choice)
		{
			case 1:
			System.out.println("enter a num :");
			n = sc.nextInt(); 
		
			if(n > 0)
			{
				System.out.println("positive");
			}
			else
			{
			System.out.println("negative");
			}
			break;
			
			case 2:
			System.out.println("enter a num :");
			n = sc.nextInt(); 
		
			if(n % 2 ==0)
			{
			System.out.println("even");
			}
			else{
			System.out.println("odd");
			}
			break;
			
			case 3:
			int n1 = 10, n2 = 20;
			if(n1 > n2)
			{
			System.out.println("maximum is :"+n1);
			}
			else 
			{
				System.out.println("maximum is :"+n2);
			}
		}
	}
}