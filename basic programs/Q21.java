import java.util.Scanner;
class Q21
{
public static void main(String x[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the num :");
	int num = sc.nextInt();
	
	int d1 = num % 10;
	int updateNumAfterD1 = num / 10;
	System.out.println("digit 1 :"+d1);
		
	int d2 = updateNumAfterD1 % 10;
	int updateNumAfterD2 = updateNumAfterD1 / 10;
	System.out.println("digit 2 :"+d2);
	
	int d3 = updateNumAfterD2 % 10;
	System.out.println("digit 3 :"+d3);
	
	System.out.printf("Output %d%d%d",d1,d2,d3);	
}
}