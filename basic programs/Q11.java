class Q11
{
	public static void main(String x[])
	{
		int m1 = Integer.parseInt(x[0]);
		int m2 = Integer.parseInt(x[1]);
		int m3 = Integer.parseInt(x[2]);
		int m4 = Integer.parseInt(x[3]);
		int m5 = Integer.parseInt(x[4]);
		
		int total = m1+m2+m3+m4+m5;
		double percentage = total/5;
		System.out.printf("Total %d\n",total);
		System.out.printf("Percentage %.2f",percentage);
	}
}