import java.util.Scanner;

class Q23
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int s = sc.nextInt();

        int a[] = new int[s];

        System.out.println("Enter the array:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        boolean flag = false;
		boolean visited[] = new boolean[s];

        for(int i = 0; i < a.length; i++)
        {
            int count = 1;

            if(!visited[i])
            {
                for(int j = i + 1; j < a.length; j++)
                {
                    if(a[i] == a[j])
                    {
                        count++;
                        visited[j] = true;
                    }
                }

                if(count > (a.length / 2))
                {
                    System.out.println("Majority Element: " + a[i]);
                    flag = true;
                    break;
                }
            }
        }
		
		if(!flag)
		{
			System.out.println("No Majority element found ");
		}
        sc.close();
    }
}