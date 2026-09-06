class Q55
{
	public static void main(String x[])
	{
		int rating = 9;
		String msg = (rating > 8) ? "%15 Bonus" : (rating >=5 && rating <=8) ? "10% Bonus" : "No Bonus";
		System.out.println(msg);
	}
}