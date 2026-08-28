class Q8
{
public static void main(String x[])
{
	float celsius = Float.parseFloat(x[0]);
	float fahren = (celsius * 9/5) + 32;
	System.out.printf("Fahrenheit is %.2f",fahren);
}
}