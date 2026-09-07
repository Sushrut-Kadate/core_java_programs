import java.util.Scanner;
class Q57
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the volume xx and yy :");
		int xx = sc.nextInt(); int yy = sc.nextInt();
		
		if(xx < yy || xx > yy)
		{
			int minButtonPress = Math.abs(xx - yy);
			System.out.println(minButtonPress);
		}
		else
		{
			System.out.println("No change in Volume");
		}
	}
}