import java.util.Scanner;
class Q25
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount :");
		int amount = sc.nextInt();
		
		// 500 notes
		int n500 = amount / 500; // 5 notes
		int updateAmountn500 = amount % 500; // remainder 28
		System.out.println("500 notes "+n500);
		
		// 100 notes
		int n100 = updateAmountn500 / 100; // 0 notes
		int updateAmountn100 = updateAmountn500 % 100; // remainder 28
		System.out.println("100 notes "+n100);
		
		// 50 notes 
		int n50 = updateAmountn100 / 50; // 0 notes
		int updateAmountn50 = updateAmountn100 % 50; // remainder 28 
		System.out.println("50 notes "+n50);
		
		// 20 notes
		int n20 = updateAmountn50 / 20; // 1 note
		int updateAmountn20 = updateAmountn50 % 20; // remainder 8
		System.out.println("20 notes "+n20);
		
		// 10 notes
		int n10 = updateAmountn20 / 10; // 0 note
		int updateAmountn10 = updateAmountn20 % 10; // remainder 8
		System.out.println("10 notes "+n10);
		
		//5 coin 
		int n5 = updateAmountn10 / 5; // 1 coin
		int updateAmountn5 = updateAmountn10 % 5; // remainder 3 
		System.out.println("5 coins "+n5);
		
		// 2 coins
		int n2 = updateAmountn5 / 2; // 1
		int updateAmountn2 = updateAmountn5 % 2; // remainder 1
		System.out.println("2 coins "+n2);
		
		//1 coins
		int n1 = updateAmountn2 / 1;
		int updateAmountn1 = updateAmountn2 % 1;
		System.out.println("1 coins "+n1);
	}
}