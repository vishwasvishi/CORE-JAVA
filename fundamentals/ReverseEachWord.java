class ReverseEachWord
{
    public static String reverseWord(String word)
    {
        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--)
        {
            rev = rev + word.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args)
    {
        String str = "Java is easy";
        String[] words = str.split(" ");

        for (String word : words)
        {
            System.out.print(reverseWord(word) + " ");
        }
    }
}