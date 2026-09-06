import java.util.Scanner;
class Q51
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the values :");
		int p = sc.nextInt() ; 
		System.out.println("P:"+p);
		int q =sc.nextInt() ; 
		System.out.println("Q:"+q);
		int r = sc.nextInt();
		System.out.println("R:"+r);
		
		String msg = (p>q && p<r) ? "Middle is P" : (q>p && q<r) ? "Middle is Q" : "Middle is R";
		System.out.println(msg);
	}
}

// case 1 : q p r 
// case 2 : p q r 
// case 3 : p r q 