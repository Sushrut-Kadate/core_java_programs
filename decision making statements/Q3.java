class Q3
{
	public static void main(String x[])
	{
		int a=6; int b=5; int c=5;
		if(a == b && a==c && b==c)
		{
			System.out.println("Equilateral");
		}
		else if(a==b || a==c || b==c)
		{
			System.out.println("Isosceles");
		}
		else
		{
			System.out.println("Scalance");
		}
	}
}