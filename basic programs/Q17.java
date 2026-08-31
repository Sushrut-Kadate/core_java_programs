import java.util.Scanner;
class Q17
{
public static void main(String x[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter seconds :");
	int  sec = sc.nextInt();
	
	int hrs = sec /3600;
	System.out.println("Hours"+hrs);
	int remaningSeconds = sec % 3600;
	int minutes = remaningSeconds / 60;
	System.out.println("Minutes"+minutes);
	int finalSeconds = remaningSeconds % 60;
	System.out.println("Seconds"+finalSeconds);
	
}
}
