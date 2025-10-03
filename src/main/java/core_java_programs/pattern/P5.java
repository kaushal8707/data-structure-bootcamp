package com.example.pattern;
/*

     1
    2 3
   4 5 6
  7 8 9 10


 */
public class P5
{
    public static void main(String[] args)
    {
        int count=0;
        for(int i=0;i<4;i++)
        {
            for(int j=3-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                count++;
                System.out.print(" "+count);
            }
            System.out.println();
        }

    }
}
