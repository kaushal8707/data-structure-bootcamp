package com.example.pattern;
/*
       *
      * *
     * * *
    * * * *


 */
public class P4
{
    public static void main(String[] args)
    {
      for(int i=0;i<4;i++)
      {
          for(int j=3-i;j>0;j--)
          {
              System.out.print(" ");
          }
          for(int k=0;k<=i;k++)
          {
              System.out.print("*");
          }
          System.out.println();

      }
    }
}
