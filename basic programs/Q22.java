import java.util.Scanner;
class Q22
{
public static void main(String x[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num :");
	int num = sc.nextInt();
	
	int lastDigit = num%10;
	System.out.println("Last Digit"+lastDigit);

	int firstDigit = num / 100;
	System.out.println("First Digit"+firstDigit);
	
	int sum = firstDigit + lastDigit ;
	System.out.println(sum);
}
}