import java.util.Scanner;
class Q28
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double disc = Math.pow(b,2) - 4*a*c;
		System.out.println("Discriminant :"+disc);
		
		if(disc >0)
		{
			double root1, root2;
			root1 = (-b + Math.sqrt(disc))/2 * a;
			System.out.println("Root 1 :"+root1);
			
			root2 = (-b - Math.sqrt(disc))/2 * a;
			System.out.println("Root 2 "+root2);
		}
		else if(disc == 0)
		{
			double root = -b /2 * a;
			System.out.println("Root "+root);
		}
		else
		{
		System.out.println("No real roots");
		}
	}
}