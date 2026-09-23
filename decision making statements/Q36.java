import java.util.Scanner;
class Q36
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age :");
		int age = sc.nextInt();
		
		if(age <13)
		{
			System.out.println("Child");
		}
		else if(age >13 && age <18)
		{
			System.out.println("Teenager");
		}
		else if(age >=18 && age<=59)
		{
		System.out.println("Adult");		
		}
		else{
			System.out.println("Senior Citizen");
		}
	}
}