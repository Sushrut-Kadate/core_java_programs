import java.util.Scanner;
class Q26
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height");
		int height = sc.nextInt();
		
		if(height < 150)
		{
		System.out.println("Dwarf");
		}
		else if(height >=150 && height <165)
		{
		System.out.println("Average");
		}
		else
		{
		System.out.println("Taller");
		}
	}
}