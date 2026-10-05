import java.util.*;
class Q50
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the test case");
		int testcase = sc.nextInt();
		
		System.out.println("enter size of friends group ");
		int nn = sc.nextInt();
		
		System.out.println("enter capacity of course");
		int mm = sc.nextInt();
		
		System.out.println("enter students already enrolled");
		int kk = sc.nextInt();
		
		if(nn < mm )
		{
			int remaining = kk - nn;
			if(remaining < kk)
			{
				System.out.println("Can enroll");
			}
			else
			{
				System.out.println("can't enroll ");
			}
		}
		else if(nn > mm && nn > kk)
		{
		System.out.println("can't enroll in course");
		}
		else if(nn == mm || nn > kk)
		{
			System.out.println("can't enroll");
		}
	}
}