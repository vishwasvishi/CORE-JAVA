class PerfectNumbers
{
    public static boolean isPerfect(int num)
    {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++)
        {
            if (num % i == 0)
            {
                sum = sum + i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args)
    {
        int N = 10000;

        System.out.println("Perfect Numbers between 1 and " + N + " are:");

        for (int i = 1; i <= N; i++)
        {
            if (isPerfect(i))
            {
                System.out.println(i);
            }
        }
    }
}