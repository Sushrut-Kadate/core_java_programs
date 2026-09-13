class Q16
{
	public static void main(String x[])
	{
		int num1 = 9; int num2 = 4; int num3 = 7;
		if(num1 < num2 && num1 < num3)
		{
			System.out.println("Min num"+" "+num1);
		}
		else if(num2 < num1 && num2 < num3)
		{
			System.out.println("Min num"+" "+num2);
		}
		else
		{
			System.out.println("Min num"+" "+num3);
		}
	}
}