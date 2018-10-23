package com.mani.crack;

public class Problem3
{
    /*
    * Design an algorithm and write code to remove the duplicate characters in a
    * string without using any additional buffer.
    * NOTE: One or two additional variables are fine. An extra copy of the array is not.
    * */
    public static void main(String[] args)
    {
        //System.out.println(removeDupChars("aaaaaa"));
        removeDupChars("aaaaaa");
    }

    private static void removeDupChars(String string)
    {

      /*  char[] chars = string.toCharArray();
        int tail=1;
        int lln= chars.length;

        for (int i=1;i<lln;++i)
        {
            int j;

            for (j=0;j<tail;++j)
            {
                //find out which char's are equal
                if (chars[j]==chars[i]) break;
            }
            if (j==tail)
            {

                chars[tail]=chars[i];
                ++tail;
            }

        }
        chars[tail]=0;*/

        if (string ==null) return ;
        char[] str = string.toCharArray();
        int len = str.length;
        if (len <2 ) return ;

        int tail=1;

        for (int i=1;i<len;++i)
        {
            int j;

            for (j=0;j<tail;++j)
            {
                if (str[i]==str[j]) break;
            }
            if (j==tail)
            {
                str[tail]=str[i];
                ++tail;
            }
        }
        str[tail]=0;
        System.out.println(str);
    }

}
