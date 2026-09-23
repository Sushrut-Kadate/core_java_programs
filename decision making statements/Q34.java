import java.util.Scanner;
class Q34
{
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no of monkeys :");
	int n = sc.nextInt();
	System.out.println("no of banana eaten by 1 monkey :");
	int k = sc.nextInt();
	System.out.println("no of peanuts eaten by 1 monkey :");
	int j = sc.nextInt();
	System.out.println("enter no of total banana :");
	int m = sc.nextInt();
	System.out.println("enter no of total peanuts :");
	int p = sc.nextInt();
	
	int bananaEaten = m / k;
	int bananaEatenRemainder = m%k; 
	int remainingBanana = m - bananaEaten; 
	int peanutsEaten = p / j;
	int peanutsEatenRemainder = p%j;
	int remainingPeanuts = p - peanutsEaten; 
	
	int totalMonkeyDown = bananaEaten + peanutsEaten;
	System.out.println("Total monkey came down "+totalMonkeyDown);
	System.out.println("Remaining monkeys "+ (n - totalMonkeyDown));
	
	// System.out.println("Remaining Banana :"+bananaEatenRemainder);
	// System.out.println("Remaining Peanuts :"+peanutsEatenRemainder);
	if()
	{
		
	}

}
}