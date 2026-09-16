import java.util.Scanner;
class Q27
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phy Marks :");
		int phy = sc.nextInt();
		
		System.out.println("Enter Bio Marks :");
		int bio = sc.nextInt();
		
		System.out.println("Enter Chem Marks :");
		int chem = sc.nextInt();
		
		System.out.println("Enter Maths Marks :");
		int maths =  sc.nextInt();
		
		System.out.println("Enter comp Marks :");
		int comp =  sc.nextInt();
		
		double percentage = (phy + bio + chem + maths + comp) / 5;
		System.out.println("Percentage is "+percentage);
		
		if(percentage >= 90)
		{
		System.out.println("Grade A");
		}
		else if(percentage >=80)
		{
		System.out.println("Grade B");
		}
		else if(percentage >=70)
		{
		System.out.println("Grade C");
		}
		else if(percentage >=60)
		{
		System.out.println("Grade D");
		}
		else if(percentage >=40)
		{
		System.out.println("Grade E");
		}
		else
		{
		System.out.println("Fail");
		}
	}
}