import java.util.Scanner;
class Q29
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of units :");
		int units = sc.nextInt();
		double totalBill =0;
		
		if(units <=50)
		{
			totalBill = 50 * 0.5;
		}
		else if(units >50 && units <=150)
		{
			totalBill = (50 * 0.5) + ((units - 50) * 0.75);
		}
		else if(units >150 && units <=300)
		{
			totalBill = (50 * 0.5) + (100 * 0.75) + ((units - 150) * 1.20);
		}
		else
		{
			totalBill = (50 * 0.5) + (100 * 0.75) + (150 * 1.20) + ((units - 300) * 1.50);
		}
		
		double billAfterSurcharge = totalBill + (totalBill * 0.2);
		System.out.println("Total Bill : "+billAfterSurcharge);
	}
}