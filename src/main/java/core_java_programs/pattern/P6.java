package com.example.pattern;

/*

1
12
123
1234
12345

 */
public class P6
{
    public static void main(String[] args)
    {
        for(int i=0;i<5;i++)
        {
            int count=0;
            for(int j=0;j<=i;j++)
            {
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }
}
