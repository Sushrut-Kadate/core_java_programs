import java.util.Scanner;

class Q20
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        double sqrt = Math.sqrt(num);

        System.out.println("Square Root : " + sqrt);

        if (sqrt == (int)sqrt)
        {
            System.out.println("Perfect Square");
        }
        else
        {
            System.out.println("Not Perfect Square");
        }
    }
}