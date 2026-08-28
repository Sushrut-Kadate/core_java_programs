public class Q7{
	public static void main(String x[])
	{
	 float farhn = Float.parseFloat(x[0]);
	 float cels = (farhn - 32) * 5/9;
	 System.out.printf("Celsius %.4f",cels);
	}
}