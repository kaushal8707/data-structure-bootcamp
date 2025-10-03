package com.example.recursive;

public class FactorialRecursion
{
    public static void main(String[] args) {
    int result= FactorialRecursion.factorial(5);
    System.out.println("Factorial = "+result);

    }

    static int factorial(int num)
    {
        if(num==0)
        {
            return 1;
        }
        return num*factorial(num-1);
    }
}
