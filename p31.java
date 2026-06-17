class p31
{
    public static void main(String[] args)
    {
        int i = 1;

        while(i <= 3)
        {
            int j = 1;

            while(j <= 5)
            {
                if(i == 2)
                {
                    if(j == 5)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else
                {
                    if(j % 2 != 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                j++;
            }

            System.out.println();
            i++;
        }
    }
}