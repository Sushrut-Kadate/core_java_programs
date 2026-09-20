import java.util.Scanner;
class Q31
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int wnum = sc.nextInt();
		
		if(wnum == 1)
		{
		System.out.println("Monday");
		}else if(wnum == 2)
		{
			System.out.println("Tuesday");
		}else if(wnum == 3)
		{
			System.out.println("Wednesday");
		}else if(wnum == 4)
		{
			System.out.println("Thursday");
		}else if(wnum == 5)
		{
			System.out.println("Friday");
		}else if(wnum == 6)
		{
			System.out.println("Saturday");
		}else if(wnum == 7)
		{
			System.out.println("Sunday");
		}else{
			System.out.println("Invalid Week Numbers");
		}
	}
}