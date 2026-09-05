import java.util.Scanner;
class Q48
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		/*
		String msg = marks > 40 ? "Pass":"Fail";
		System.out.println(msg);
		*/
		
		String grade = (marks >=90) ? "Excellent" : (marks >=75) ? "Good" : (marks>50) ? "Average" : "Poor";
		System.out.println(grade);
		}
}
