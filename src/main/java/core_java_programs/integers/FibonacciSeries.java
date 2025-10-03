package com.example.integers;
public class FibonacciSeries
{
    public static void main(String[] args)
    {
      for(int i=1;i<=10;i++)
      {
          System.out.print(printFibonacci(i)+"  ");
      }
        System.out.println();
        System.out.println("*****  Another Ways *****");
        int limit=10;
        getSeries(limit);
    }
    public static int printFibonacci(int i)
    {
        if(i==1)
        {
           return 0;
        }else if(i==2 || i==3)
        {
           return 1;
        }else
            return printFibonacci(i-1)+printFibonacci(i-2);
    }
    public static void getSeries(int n)
    {
       int a=0,b=1;
       System.out.print(a+"  "+b+"  ");
       int count=0;
       while(count<n-2)
       {
           int c=a+b;
           a=b;
           b=c;
           count++;
           System.out.print(c+"  ");
       }
    }
}
