class Q9
{
public static void main(String x[])
{
	int angle1 = Integer.parseInt(x[0]);
	int angle2 = Integer.parseInt(x[1]);
	
	int angle3 = 180 - (angle1 + angle2 );
	System.out.printf("Third Angle %d",angle3);
}
}