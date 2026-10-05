import java.util.Scanner;
class Q51
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the chef iq :");
		int iq = sc.nextInt();
		
		int newIq = iq + 7;
		if(newIq > 170)
		{
		System.out.println("yes");
		}
		else 
		{
		System.out.println("no");
		}
	}
}