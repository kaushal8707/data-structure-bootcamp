package com.example.pattern;
/*
     1 2 3 4 5
      2 3 4 5
       3 4 5
        4 5
         5

 */
public class P7
{
    public static void main(String[] args)
    {
      for(int i=0;i<5;i++)
      {
          for(int j=1;j<=i;j++)
          {
              System.out.print(" ");
          }
          for(int k=i+1;k<=5;k++)
          {
              System.out.print(" "+k);
          }
          System.out.println();
      }
    }
}
