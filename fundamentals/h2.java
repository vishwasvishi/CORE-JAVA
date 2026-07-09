/* Write a Java program to print all Strong Numbers between 1 and N */

class h2
{
    public static int cal(int num)
    {
        int fact = 1;

        for (int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }

        return fact;
    }
    public static boolean strong(int num)
    {
        int temp = num;
        int sum = 0;

        while (temp != 0)
        {
            int digit = temp % 10;
            sum = sum + cal(digit);
            temp = temp / 10;
        }

        return sum == num;
    }

    public static void main(String[] args)
    {
        int n = 1000;

        System.out.println("Strong Numbers between 1 and " + n + " are:");

        for (int i = 1; i <= n; i++)
        {
            if (strong(i))
            {
                System.out.println(i);
            }
        }
    }
}