package com.example.integers;

public class ArmStrongNumber
{
    public static void main(String[] args) {

        int number=153;
        int temp=number;
        int rev=0,sum=0;
        while(number!=0)
        {
            rev=number%10;
            sum+=(rev*rev*rev);
            number/=10;
        }
        if(temp==sum)
        {
            System.out.println(temp+"  is Armstrong number");
        }
    }
}
