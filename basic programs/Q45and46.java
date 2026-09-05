import java.util.Scanner;
class Q45and46
{
public static void main(String x[])
{
	
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	
	if(n1 > n2)
	{
		System.out.println("Maximum :"+n1);
	}
	else
	{
		System.out.println("Minimum :"+n2);
	}
}
}