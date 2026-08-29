class Q13
{
public static void main(String x[])
{
	double p = Double.parseDouble(x[0]);
	double r = Double.parseDouble(x[1]);
	double t = Double.parseDouble(x[2]);
	
	double ci = p * (Math.pow((1+r/100),t)) - p;
	System.out.printf("Compount Interest %.2f",ci);
}
}