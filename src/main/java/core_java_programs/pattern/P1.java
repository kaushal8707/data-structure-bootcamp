package com.example.pattern;
/*
1
23
456
78910


 */
public class P1
{
    public static void main(String[] args)
    {
        int r=4,c=4;
        int k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<=i;j++)
            {
                k++;
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
