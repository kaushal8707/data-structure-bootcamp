package com.example.recursive;

public class FibonacciSeries
{
    public static void main(String[] args) {

        for(int i=0;i<10;i++)
        {
            System.out.println(getFibonacciSeries(i));
        }
    }

    private static int getFibonacciSeries(int i)
    {
        if(i==0)
        {
            return 0;
        }
        if(i==1 || i==2)
    {
        return 1;
    }
        return getFibonacciSeries(i-1)+getFibonacciSeries(i-2);
    }
}
