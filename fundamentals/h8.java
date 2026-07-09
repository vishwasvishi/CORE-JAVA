class h8
{
    static int count = 0;

    h8()
    {
        count++;
    }

    public static void main(String args[])
    {
        h8 o=new h8();
        h8 o2=new h8();
        h8 o3=new h8();

        System.out.println("Objects = " + count);
    }
}