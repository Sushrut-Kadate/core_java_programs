import java.util.Scanner;
class Ques2{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the values");

	int n = sc.nextInt();
	float f = sc.nextFloat();
	double b = sc.nextDouble();
	char c = sc.next().charAt(0);
	boolean bo = sc.nextBoolean();

	System.out.println("------------");
	System.out.println(n);
	System.out.println(f);
	System.out.println(b);
	System.out.println(c);
	System.out.println(bo);
	}
}