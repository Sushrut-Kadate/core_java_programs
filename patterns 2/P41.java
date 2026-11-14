class P41
{
	
	/*
	
	
	1
	3	3	3
	5	5	5	5	5	
	3	3	3
	1

	
	*/
    public static void main(String x[])
    {
        int n = 1;

        for(int i = 1; i <= 5; i++)
        {
            // Print n, n times
            for(int j = 1; j <= n; j++)
            {
                System.out.print(n + "  ");
            }

            System.out.println();

            // Increase until 5
            if(n < 5)
            {
                n = n + 2;
            }
            // Then decrease
            else
            {
                n = n - 2;
            }
        }
    }

}